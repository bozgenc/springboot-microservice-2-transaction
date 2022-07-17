package com.sha.springbootmicroservice2transaction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class SpringbootMicroservice2TransactionApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringbootMicroservice2TransactionApplication.class, args);
	}
}
