package com.telusko.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "controller") //otherwise whitelabel error
public class RestApi1Application {

	public static void main(String[] args) {
		SpringApplication.run(RestApi1Application.class, args);
	}

}
