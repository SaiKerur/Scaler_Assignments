package com.scaler.ecommerce_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "com.scaler.ecommerce_demo.model")
@EnableJpaRepositories(basePackages = "com.scaler.ecommerce_demo.repository")
public class ECommerceDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ECommerceDemoApplication.class, args);
    }

}
