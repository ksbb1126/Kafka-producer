package com.example.kafka01.service;

import com.example.kafka01.domain.Order;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProducerService {
    private static final Logger logger = LoggerFactory.getLogger(ProducerService.class);
    private static final String TOPIC = "test-topic";
    private static final String STORE_NAME = "BUSAN";
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;
    @Autowired
    private ObjectMapper objectMapper;

    public void sendMessage(String name) throws JsonProcessingException {
        Order newOrder = new Order(null, name, STORE_NAME);
        logger.info("### -> Producing message -> {}", newOrder.toString());

        String strOrder = objectMapper.writeValueAsString(newOrder);
        this.kafkaTemplate.send(TOPIC, strOrder);
    }
}
