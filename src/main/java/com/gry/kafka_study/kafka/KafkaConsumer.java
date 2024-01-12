package com.gry.kafka_study.kafka;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaConsumer {

    @KafkaListener(topics = "topic1", groupId = "myGroup")
    public void consume(String message){
        log.info(String.format("Message consumed -> %s", message));
    }

}
