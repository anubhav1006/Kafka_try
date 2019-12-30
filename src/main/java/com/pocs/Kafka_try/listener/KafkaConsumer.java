package com.pocs.Kafka_try.listener;

import com.pocs.Kafka_try.model.User;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "demo", groupId = "group_json",
            containerFactory = "userKafkaListenerFactory")
    public void consumeJson(User user) {

        System.out.println("Consumed JSON Message: " + user);
    }
}
