//package com.example.demo123.JPA;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//import com.example.demo123.Course.Course;
//
//
//@Component
//public class CourseCommandLineRunnerJPA implements CommandLineRunner{
//
//	@Autowired
//	CourseJPARepository repository;
//	
//	@Override
//	public void run(String... args) throws Exception {
//
//		repository.insert(new Course(1, "java" , "in28minutes"));
//		repository.insert(new Course(2, "phython" , "in28minutes"));
//		repository.insert(new Course(3, "javascript" , "in28minutes"));
//		repository.insert(new Course(4, "sql" , "in28minutes"));
//		repository.insert(new Course(5, "springBoot" , "in28minutes"));
//
//		
//		repository.delete(3);
//		
//		System.out.println(repository.findById(4));
//		System.out.println(repository.findById(5));
//
//		
//	}
//
//	
//	
//		
//	}
//
//	
