package springBootLearning.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import springBootLearning.demo.Course.Course;

@RestController
public class CourseController {

	@GetMapping("/course")
	public List<Course> getAllCourse() {

		return Arrays.asList(new Course(1, " Learn Microservices ", "28minutesLearning"),
				new Course(2, "lean Java", "telusko"),
				new Course(3, "lean Phython", "telusko"));

	}
	@GetMapping("/course/2")
	public Course getSecondCourse() {
		return new Course(2, "lean Java", "telusko");
		
		
	}

}
