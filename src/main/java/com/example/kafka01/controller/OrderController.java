package com.example.kafka01.controller;

import com.example.kafka01.domain.Order;
import com.example.kafka01.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class OrderController {
  @Autowired
  OrderService orderService;

  @GetMapping("list")
  public String list(HttpServletRequest request) {
    List<Order> orders = orderService.orderList();
    request.setAttribute("orders", orders);

    return "list";
  }
}
