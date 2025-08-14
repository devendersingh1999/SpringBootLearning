package com.example.demo123.SpringJPA;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo123.Course.Course;

public interface SpringDataJPARepository  extends JpaRepository<Course, Long>{

	List<Course> findByAuthor(String author);

	
}
