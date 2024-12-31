package de.stone.kafka.kafkatest;

import org.apache.kafka.clients.producer.ProducerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class Publisher {

    @Autowired
    private KafkaTemplate<String, Order> kafkaTemplate;

    private final Integer orderId = 1;

    @Scheduled(fixedRate = 5000)
    public void sendMessages() {

        kafkaTemplate.send("testMarkus", "BOOK_ORDER", getBookOrder());
        kafkaTemplate.send("testMarkus", "BOOK_ORDER", getBookOrder());
        kafkaTemplate.send("testMarkus", "MOVIE_ORDER", getMovieOrder());
        kafkaTemplate.send("testMarkus", "MUSIC_ORDER", getMusicOrder());

        System.out.println("Sent 4 new messages to Kafka...");
    }

    private Order getBookOrder() {
        Order o = new Order();//orderId.toString());
        o.addProduct(new Order.Product("Shining", 10));
        o.addProduct(new Order.Product("It", 20));
        o.addProduct(new Order.Product("The Dark Tower", 5));

        return o;
    }

    private Order getMovieOrder() {
        Order o = new Order(orderId.toString());
        o.addProduct(new Order.Product("The Godfather", 20));
        o.addProduct(new Order.Product("Pulp Fiction", 5));
        o.addProduct(new Order.Product("Alien", 10));

        return o;
    }

    private Order getMusicOrder() {
        Order o = new Order(orderId.toString());
        o.addProduct(new Order.Product("Misfits", 7));
        o.addProduct(new Order.Product("The Exploited", 5));
        o.addProduct(new Order.Product("The Clash", 10));

        return o;
    }
}
