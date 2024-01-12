package com.gry.kafka_study.kafka;

import com.gry.kafka_study.payload.User;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Slf4j
@Service
public class JsonKafkaProducer {

    private final KafkaTemplate<String, User> kafkaTemplate;

    public void sendMessage(User data){
        log.info(String.format("Json message sent -> %s",data.toString()));

        Message<User> message = MessageBuilder
                .withPayload(data)
                .setHeader(KafkaHeaders.TOPIC, "topic1_json")
                .build();

        kafkaTemplate.send(message);
    }

}
