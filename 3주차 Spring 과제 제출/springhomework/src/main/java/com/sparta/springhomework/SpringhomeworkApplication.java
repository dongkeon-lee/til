package com.sparta.springhomework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SpringhomeworkApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringhomeworkApplication.class, args);
    }

}
