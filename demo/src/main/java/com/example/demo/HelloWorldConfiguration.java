package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record 	Person(String name , int age) {}

@Configuration
public class HelloWorldConfiguration {
	@Bean
	public String name() {

		return "Dev";
	}
	
	@Bean
	public Person person() {
		
		return new Person("Ravi" , 20);
	}
}
