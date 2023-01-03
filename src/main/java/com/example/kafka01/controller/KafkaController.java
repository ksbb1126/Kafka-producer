package com.example.kafka01.controller;

import com.example.kafka01.service.ProducerService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class KafkaController {
    @Autowired
    ProducerService producerService;

    @PostMapping("kafka")
    public String sendMessage(@RequestParam String name) throws JsonProcessingException {
        producerService.sendMessage(name);
        return "redirect:/";
    }
}
