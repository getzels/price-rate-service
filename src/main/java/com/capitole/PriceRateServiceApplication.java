package com.capitole;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.capitole.model")
public class PriceRateServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(PriceRateServiceApplication.class, args);
    }

}
