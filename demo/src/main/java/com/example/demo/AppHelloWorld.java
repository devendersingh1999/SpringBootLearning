package com.example.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppHelloWorld {
public static void main(String[] args) {
	
	
	var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

	System.out.println(context.getBean("name"));
	
	System.out.println(context.getBean("person"));
}
}	