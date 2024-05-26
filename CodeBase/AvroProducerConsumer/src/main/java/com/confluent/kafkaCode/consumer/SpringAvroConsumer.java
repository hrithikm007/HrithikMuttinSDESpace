package com.confluent.kafkaCode.consumer;

import com.confluent.kafkaCode.avro.schema.StockHistory;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class SpringAvroConsumer {

    @KafkaListener(topics = "${avro.topic.name}", containerFactory = "kafkaListenerContainerFactory")
    public void listen(ConsumerRecord<String, StockHistory> record) {
        System.out.println("Key is : "+ record.key());
        System.out.println("Value is : "+ record.value());
    }
}
