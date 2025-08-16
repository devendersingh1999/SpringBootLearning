package com.example.demo123.SpringJPA;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo123.Course.Course;

public interface SpringDataJPARepository  extends JpaRepository<Course, Long>{

	//here we can write methods
	List<Course> findByAuthor(String author);

	
}
