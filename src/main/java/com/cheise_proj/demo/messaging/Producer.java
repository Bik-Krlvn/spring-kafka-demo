package com.cheise_proj.demo.messaging;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import static com.cheise_proj.demo.messaging.Constants.TOPIC;

@Slf4j
@Service
public class Producer {
    private final KafkaTemplate<String, String> kafkaTemplate;

    @Autowired
    public Producer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(String message){
        log.info(String.format("#### -> Producing message -> %s", message));
        kafkaTemplate.send(TOPIC,message);
    }
}
