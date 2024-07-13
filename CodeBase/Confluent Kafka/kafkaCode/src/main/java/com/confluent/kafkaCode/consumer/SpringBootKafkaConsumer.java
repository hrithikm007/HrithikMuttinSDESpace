package com.confluent.kafkaCode.consumer;

import com.confluent.kafkaCode.model.Tutorial;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class SpringBootKafkaConsumer {

    @KafkaListener(topics = "${topic.name}", containerFactory = "kafkaListenerContainerFactory")
    public void listen(Tutorial value)
    {
        System.out.println("Message Received: " + value.toString());
    }
}
