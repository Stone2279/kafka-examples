package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;
import mypostgres.public$.test_kunden.Envelope;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Statistics {

    @JsonProperty("timestamp")
    private LocalDateTime timestamp;

    @JsonProperty("cdcData")
    private List<Envelope> cdcData;

    @JsonProperty("countries")
    private Map<String, Integer> countryStatistics = new HashMap<>();

    public Statistics() {
    }

    public Statistics(List<Envelope> cdcData, LocalDateTime timestamp) {
        this.timestamp = timestamp;
        this.cdcData = cdcData;
        calculate();
    }

    private void calculate() {

        for (Envelope cdcDatum : cdcData) {
            String country = cdcDatum.getAfter().getCountry().toString();

            if(countryStatistics.containsKey(country)) {
                Integer counter = countryStatistics.get(country);
                countryStatistics.put(country, ++counter);
            } else {
                countryStatistics.put(country, 1);
            }
        }

    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public List<Envelope> getCdcData() {
        return cdcData;
    }

    public void setCdcData(List<Envelope> cdcData) {
        this.cdcData = cdcData;
    }

    public Map<String, Integer> getCountryStatistics() {
        return countryStatistics;
    }

    public void setCountryStatistics(Map<String, Integer> countryStatistics) {
        this.countryStatistics = countryStatistics;
    }

    @Override
    public String toString() {
        return "Statistics{" +
                "timestamp=" + timestamp +
                ", countryStatistics=" + countryStatistics +
                '}';
    }
}
