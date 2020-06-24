package com.example.sing_progect_telegram;

import com.example.sing_progect_telegram.service.Sign;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.ComponentScan;
import org.telegram.telegrambots.ApiContextInitializer;


@SpringBootApplication
public class SingProjectTelegramApplication{

    public static void main(String[] args) {
        ApiContextInitializer.init();
        SpringApplication.run(SingProjectTelegramApplication.class, args);

    }

}
