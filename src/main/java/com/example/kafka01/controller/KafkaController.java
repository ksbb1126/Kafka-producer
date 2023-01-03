package com.example.kafka01.controller;

import com.example.kafka01.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class KafkaController {
    @Autowired
    ProducerService producerService;

    @PostMapping("kafka")
    public String sendMessage(@RequestParam String message) {
        producerService.sendMessage(message);
        return "redirect:/";
    }
}
