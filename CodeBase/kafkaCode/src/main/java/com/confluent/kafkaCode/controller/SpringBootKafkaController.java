package com.confluent.kafkaCode.controller;

import com.confluent.kafkaCode.producer.SpringBootKafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringBootKafkaController {

    @Autowired
    SpringBootKafkaProducer springBootKafkaProducer;

    @GetMapping(value = "/send/{message}")
    public void send(@PathVariable String message){
        System.out.println("Inside Send Message Controller");
        springBootKafkaProducer.sendMessage(message);
    }
}
