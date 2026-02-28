package com.lab.payment_service;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    private final List<String> payments = new ArrayList<>();

    @GetMapping
    public List<String> getPayments() {
        return payments;
    }

    @PostMapping
    public String processPayment(@RequestBody String payment) {
        payments.add(payment);
        return "Payment processed: " + payment;
    }
}