package com.ecabs.assignment.beclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.ecabs.assignment")
public class BeClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(BeClientApplication.class, args);
	}

}
