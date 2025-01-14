package com.example.policyservice.config;

import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;


@Configuration
public class PolicyServiceSwaggerConfig {

	 @Bean
	   OpenAPI customOpenAPI() {
	        return new OpenAPI()
	                .info(new Info()
	                        .title("Policy Service API")
	                        .version("1.0")
	                        .description("API for managing policies in the Insurance Management System")
	                        .contact(new Contact()
	                                .name("Support Team")
	                                .url("http://example.com")
	                                .email("support@example.com")));
	    }
}

