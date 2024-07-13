package com.confluent.kafkaCode.Controller;

import com.confluent.kafkaCode.avro.schema.StockHistory;
import com.confluent.kafkaCode.kafka.producer.SpringAvroProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class SpringAvroRest {

    @Autowired
    SpringAvroProducer springAvroProducer;

    @PostMapping(value = "/sendStockHistory")
    public void sendStockHistory(@RequestBody StockHistory stockHistory) {
        StockHistory stockHistory1 = StockHistory.newBuilder().build();
        stockHistory1.setStockName(stockHistory.getStockName());
        stockHistory1.setTradeType(stockHistory.getTradeType());
        stockHistory1.setPrice(stockHistory.getPrice());
        stockHistory1.setAmount(stockHistory.getAmount());
        stockHistory1.setTradeId(new Random(1000).nextInt());
        stockHistory1.setTradeQuantity(stockHistory.getTradeQuantity());
        stockHistory1.setTradeMarket(stockHistory.getTradeMarket());
        springAvroProducer.send(stockHistory1);
    }
}
