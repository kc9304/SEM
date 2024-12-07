package com.example.demo;

import org.springframework.boot.SpringApplication;

import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SemApplication {

	public static void main(String[] args) {
		SpringApplication.run(SemApplication.class, args);
	}
	
	  @Bean
	    public RestTemplate restTemplate() {
	        return new RestTemplate();
	    }

}
