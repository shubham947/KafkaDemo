package com.infy.service;

import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@EnableKafka
@Service
public class Listener {
	@KafkaListener(topics = "test", groupId = "group1")
	public void consume(String message) {
		System.out.println("Message: " + message);
	}
}
