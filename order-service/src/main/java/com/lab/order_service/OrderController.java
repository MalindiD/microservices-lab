package com.lab.order_service;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final List<String> orders = new ArrayList<>();

    @GetMapping
    public List<String> getOrders() {
        return orders;
    }

    @PostMapping
    public String addOrder(@RequestBody String order) {
        orders.add(order);
        return "Order added: " + order;
    }
}