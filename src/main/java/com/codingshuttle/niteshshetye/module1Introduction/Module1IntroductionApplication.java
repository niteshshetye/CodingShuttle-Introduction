package com.codingshuttle.niteshshetye.module1Introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class Module1IntroductionApplication implements CommandLineRunner {

    // @Autowired
    // final make this immutable so in code once you initialize we can't mutate or change this
    // final NotificationService notificationService; // dependency injection (DI)

    // public Module1IntroductionApplication(@Qualifier("emailNotif") NotificationService notificationService) {
    //  public Module1IntroductionApplication(NotificationService notificationService) {
    //      this.notificationService = notificationService; // Constructor DI / preferred way
    //  }

    @Autowired
    Map<String, NotificationService> notificationServiceMap = new HashMap<>();


    public static void main(String[] args) {
		SpringApplication.run(Module1IntroductionApplication.class, args);
	}


    @Override
    public void run(String... args) throws Exception {

        // This will send notification to all the service
        for(var notificationService: notificationServiceMap.entrySet()) {
            System.out.println(notificationService.getKey());
            notificationService.getValue().send("Hello");
        }

    }
}
