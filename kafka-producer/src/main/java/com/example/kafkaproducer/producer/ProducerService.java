package com.example.kafkaproducer.producer;

import com.example.kafkaproducer.model.Message;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class ProducerService {

    private final KafkaTemplate<String, Message> kafkaTemplate;
    private final String TOPICS = "messages";

    public void send(Message data) {
        log.info("sending data='{}' to topic='{}'", data.getMessage(), TOPICS);
        kafkaTemplate.send(TOPICS,data);
    }
}
