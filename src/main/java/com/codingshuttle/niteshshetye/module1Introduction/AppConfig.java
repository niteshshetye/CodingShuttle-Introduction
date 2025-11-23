package com.codingshuttle.niteshshetye.module1Introduction;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public PaymentService paymentService() {
        // More logic may be your class depends on something which required
        return new PaymentService();
    }
}
