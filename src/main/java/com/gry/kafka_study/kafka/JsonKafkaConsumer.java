package com.gry.kafka_study.kafka;

import com.gry.kafka_study.payload.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class JsonKafkaConsumer {

    @KafkaListener(topics = "topic1_json", groupId = "myGroup")
    public void consume(User user){
        log.info(String.format("Json message consumed -> %s",user.toString()));
    }
}
