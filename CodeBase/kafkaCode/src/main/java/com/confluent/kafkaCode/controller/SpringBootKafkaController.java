package com.confluent.kafkaCode.controller;

import com.confluent.kafkaCode.model.Tutorial;
import com.confluent.kafkaCode.producer.SpringBootKafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class SpringBootKafkaController {

    @Autowired
    SpringBootKafkaProducer springBootKafkaProducer;

    @GetMapping(value = "/send/{message}")
    public void send(@PathVariable String message){
        System.out.println("Inside Send Message Controller");
        springBootKafkaProducer.sendMessage(message);
    }

    @PostMapping(value = "/send")
    public void sendMessage(@RequestBody Tutorial tutorial){
        System.out.println("Inside Kafka JSON Producer");
        springBootKafkaProducer.sendMessage(tutorial);
    }

}
