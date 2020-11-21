package com.cheise_proj.demo.messaging;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import static com.cheise_proj.demo.messaging.Constants.TOPIC;

@Service
@Slf4j
public class Consumer {
    @KafkaListener(topics = TOPIC,groupId = "group_id")
    public void consume(String message){
      log.info(String.format("### -> Consume message -> %s",message));
    }
}
