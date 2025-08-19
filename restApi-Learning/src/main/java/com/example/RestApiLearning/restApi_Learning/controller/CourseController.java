package com.example.RestApiLearning.restApi_Learning.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.RestApiLearning.restApi_Learning.CourseClass.Course;
import com.example.RestApiLearning.restApi_Learning.repository.CourseRepository;

@RestController
public class CourseController {

	@Autowired
	CourseRepository repository;

	@GetMapping("/course")
	public List<Course> getAllCourse() {

		return repository.findAll();
	}

	/*
	 * make varibale {id} to pass that variable in the method parameter we have to
	 * use @PathVariablem,
	 * 
	 * @PathVariable Annotation which indicates that a method parameter should be
	 * bound to a URI template variable. Supported for RequestMapping annotated
	 * handler methods.
	 */

	@GetMapping("/course/{id}")
	public Course getCourseDetails(@PathVariable Long id) {

		Optional<Course> course = repository.findById(id);

		if (course.isEmpty()) {
			throw new RuntimeException("Course not found");
		}
		return course.get();

	}

	// create new resource (course)
	@PostMapping("/course")
	public void createCourse(@RequestBody Course course) {

		if (course != null) {
			repository.save(course);

		}
	}

	// update/replace the resource (course)
	@PutMapping("/course/{id}")
	public void updateCourse(@PathVariable Long id, @RequestBody Course course) {

		repository.save(course);
	}

	// Delete - delete a resource (course)

	@DeleteMapping("/course/{id}")
	public void deleteCourse(@PathVariable Long id) {

		repository.deleteById(id);
	}

}
