package de.stone.postgres.dummydata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class DummydataApplication {

	public static void main(String[] args) {
		SpringApplication.run(DummydataApplication.class, args);
	}

}
