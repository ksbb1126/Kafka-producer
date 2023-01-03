package com.example.kafka01.service;

import com.example.kafka01.domain.Order;
import com.example.kafka01.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
  @Autowired
  OrderMapper orderMapper;

  public List<Order> orderList() {
    return orderMapper.selectAll();
  }
}
