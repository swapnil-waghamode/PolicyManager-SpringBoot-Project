package com.example.customerservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;

@Configuration
public class CustomerServiceSwaggerConfig {
	
	@Bean
	 OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Customer Service API")
                        .version("1.0")
                        .description("API for managing customers in the Insurance Management System")
                        .contact(new Contact()
                                .name("Support Team")
                                .url("http://java.com")
                                .email("support@java.com")));
    }

}

