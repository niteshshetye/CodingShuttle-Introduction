package com.codingshuttle.niteshshetye.module1Introduction.impl;


import com.codingshuttle.niteshshetye.module1Introduction.NotificationService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@Qualifier("smsNotif")
//@ConditionalOnProperty(name = "notification.type", havingValue = "sms")
public class SmsNotification implements NotificationService {
    @Override
    public void send(String message) {
        System.out.println("Sms Notification" + message);
    }
}
