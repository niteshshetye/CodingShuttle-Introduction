package com.codingshuttle.niteshshetye.module1Introduction;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class PaymentService {
    public void pay() {
        System.out.println("Paying...");
    }

    @PostConstruct
    public void afterInit() {
        System.out.println("After PaymentService Initialized");
    }

    @PreDestroy
    public void beforeDestroy() {
        System.out.println("Before PaymentService Destroy ");
    }
}
