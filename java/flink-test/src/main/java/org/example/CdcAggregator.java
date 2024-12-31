package org.example;

import mypostgres.public$.test_kunden.Envelope;
import org.apache.flink.api.common.functions.AggregateFunction;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class CdcAggregator implements AggregateFunction<Envelope, List<Envelope>, Statistics> {

    @Override
    public List<Envelope> createAccumulator() {
        return new ArrayList<>();
    }

    @Override
    public List<Envelope> add(Envelope envelope, List<Envelope> envelopes) {
        envelopes.add(envelope);
        return envelopes;
    }

    @Override
    public Statistics getResult(List<Envelope> envelopes) {
        return new Statistics(envelopes, LocalDateTime.now());
    }

    @Override
    public List<Envelope> merge(List<Envelope> envelopes, List<Envelope> acc1) {
        envelopes.addAll(acc1);
        return envelopes;
    }
}
