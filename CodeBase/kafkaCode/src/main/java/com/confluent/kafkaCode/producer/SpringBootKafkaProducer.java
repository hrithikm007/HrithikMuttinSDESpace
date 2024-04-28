package com.confluent.kafkaCode.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.ListenableFutureCallback;

import java.util.concurrent.CompletableFuture;

@Service
public class SpringBootKafkaProducer {

    @Autowired
    public KafkaTemplate<String,String> kafkaTemplate;

    public void sendMessage(String value){
        CompletableFuture<SendResult<String,String>> future = kafkaTemplate.send("Spring_Boot_Kafka_Topic_V1",value);

        future.whenComplete((sr, ex) -> System.out.println(future + ": " + sr.getRecordMetadata()));
    }
}
