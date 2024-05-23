package com.confluent.kafkaCode.kafka.producer;

import com.confluent.kafkaCode.avro.schema.StockHistory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

@Service
public class SpringAvroProducer {

    @Autowired
    private KafkaTemplate<String, StockHistory> kafkaTemplate;

    @Value("${avro.topic.name}")
    String topicName;


    public void send(StockHistory stockHistory){
        CompletableFuture<SendResult<String,StockHistory>> future =  kafkaTemplate.send(topicName,String.valueOf(stockHistory.getTradeId()),stockHistory);
        System.out.println("Kafka Avro Producer");
        future.whenComplete((sr, ex) -> System.out.println(future + ": " + sr.getRecordMetadata()));
    }
}
