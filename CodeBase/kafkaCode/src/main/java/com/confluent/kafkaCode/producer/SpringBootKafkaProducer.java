package com.confluent.kafkaCode.producer;

import com.confluent.kafkaCode.model.Tutorial;
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

    @Autowired
    public KafkaTemplate<String, Tutorial> kafkaTemplate1;

    public void sendMessage(String value){
        CompletableFuture<SendResult<String,String>> future = kafkaTemplate.send("demo1",value);
        System.out.println("Kafka Consumer Producer");
        future.whenComplete((sr, ex) -> System.out.println(future + ": " + sr.getRecordMetadata()));
    }

    public void sendMessage(Tutorial tutorial){
        CompletableFuture<SendResult<String,Tutorial>> future = kafkaTemplate1.send("demo1",tutorial);
        System.out.println("kafka JSON Producer");
        future.whenComplete((sr, ex) -> System.out.println(future + ": " + sr.getRecordMetadata()));
    }
}
