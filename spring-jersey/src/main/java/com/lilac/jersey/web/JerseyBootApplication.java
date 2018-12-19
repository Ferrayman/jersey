package com.lilac.jersey.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "com.lilac.jersey" })
public class JerseyBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(JerseyBootApplication.class, args);
    }

}
