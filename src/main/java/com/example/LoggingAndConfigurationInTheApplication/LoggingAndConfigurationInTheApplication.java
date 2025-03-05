package com.example.LoggingAndConfigurationInTheApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition
public class LoggingAndConfigurationInTheApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoggingAndConfigurationInTheApplication.class, args);
	}

}
