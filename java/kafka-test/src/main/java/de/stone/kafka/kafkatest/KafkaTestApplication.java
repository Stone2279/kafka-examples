package de.stone.kafka.kafkatest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class KafkaTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaTestApplication.class, args);
	}

}
