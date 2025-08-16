package com.example.RestApiLearning.restApi_Learning.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.RestApiLearning.restApi_Learning.CourseClass.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

}
