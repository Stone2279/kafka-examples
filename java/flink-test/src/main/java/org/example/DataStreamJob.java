package org.example;

import mypostgres.public$.test_kunden.Envelope;
import org.apache.flink.api.common.eventtime.WatermarkStrategy;
import org.apache.flink.connector.kafka.source.KafkaSource;
import org.apache.flink.connector.kafka.source.enumerator.initializer.OffsetsInitializer;
import org.apache.flink.formats.avro.registry.confluent.ConfluentRegistryAvroDeserializationSchema;
import org.apache.flink.streaming.api.datastream.DataStreamSource;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.streaming.api.functions.sink.PrintSinkFunction;
import org.apache.flink.streaming.api.functions.timestamps.BoundedOutOfOrdernessTimestampExtractor;
import org.apache.flink.streaming.api.windowing.assigners.TumblingEventTimeWindows;

import java.time.Duration;


public class DataStreamJob {

    public static void main(String[] args) throws Exception {
        // Sets up the execution environment, which is the main entry point
        // to building Flink applications.
        final StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();

        KafkaSource<Envelope> source = KafkaSource.<Envelope>builder()
                .setBootstrapServers("localhost:9092")
                .setTopics("mypostgres.public.test_kunden")
                .setGroupId("flink-test-group")
                .setStartingOffsets(OffsetsInitializer.earliest())
                .setValueOnlyDeserializer(ConfluentRegistryAvroDeserializationSchema.forSpecific(Envelope.class, "http://localhost:8081"))
                .build();

        final WatermarkStrategy<Envelope> mew = WatermarkStrategy
                .<Envelope>forBoundedOutOfOrderness(Duration.ofSeconds(30))
                .withTimestampAssigner((element, recordTimestamp) -> element.getTsMs());

        DataStreamSource<Envelope> stream = env.fromSource(source, mew, "Kunden Source");

        stream
                .setParallelism(1)
                .windowAll(TumblingEventTimeWindows.of(Duration.ofMinutes(1)))
                .aggregate(new CdcAggregator())
                .print();

        env.execute("Kunden Source");
    }
}
