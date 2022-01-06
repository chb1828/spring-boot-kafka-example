package com.example.kafkaproducer.controller;

import com.example.kafkaproducer.model.Message;
import com.example.kafkaproducer.producer.ProducerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class HomeController {

    private final ProducerService producerService;

    @GetMapping("/generate")
    public String generate(@RequestParam String message, @RequestParam int age) {
        producerService.send(new Message(message,age));
        return "OK";
    }
}
