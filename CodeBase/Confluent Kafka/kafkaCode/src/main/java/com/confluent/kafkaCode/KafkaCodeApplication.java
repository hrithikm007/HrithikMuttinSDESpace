package com.confluent.kafkaCode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class KafkaCodeApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaCodeApplication.class, args);
	}

}
