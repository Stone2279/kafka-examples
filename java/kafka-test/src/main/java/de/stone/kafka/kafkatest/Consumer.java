package de.stone.kafka.kafkatest;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

//@Service
public class Consumer {

    @KafkaListener(topics = "testMarkus", groupId = "spring-1")
    public void listen(@Payload Order message,
                       @Header(KafkaHeaders.RECEIVED_KEY) String key,
                       @Header(KafkaHeaders.RECEIVED_PARTITION) int partition) {

        String meta = String.format("Received Message from topic: testMarkus, key: %s, partition: %d", key, partition);
        System.out.println( meta + "\n " + message);
    }


}
