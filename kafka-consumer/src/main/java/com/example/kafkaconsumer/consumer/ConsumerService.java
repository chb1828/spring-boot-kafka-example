package com.example.kafkaconsumer.consumer;

import com.example.kafkaconsumer.model.Message;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

    @KafkaListener(topics = "messages",groupId = "message_group_id")
    public void consume(Message message) {
        System.out.println("Consuming the message :" + message);
    }
}
