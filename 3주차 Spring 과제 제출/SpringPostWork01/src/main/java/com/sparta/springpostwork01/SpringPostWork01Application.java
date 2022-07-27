package com.sparta.springpostwork01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SpringPostWork01Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringPostWork01Application.class, args);
    }

}
