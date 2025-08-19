package com.example.RestApiLearning.restApi_Learning.CourseClass;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//@NoArgsConstructor   // generates no-arg constructor
//@AllArgsConstructor  // generates all-args constructor
//@Getter              // generates getters
//@Setter              // generates setters

@Entity(name = "Course1") // this will create the Coures1 table
public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // use MySQL AUTO_INCREMENT
	private Long id;//Long is wrapper class 

	@Column(name = "courseName") // this will create the courseName column
	private String name;

	@Column(name = "courseAuthor") // this will create the courseAuthor column
	private String author;

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Course(Long id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", author=" + author + "]";
	}

	// add dependencies
	/*
	 * 1. spring web 2. spring data jpa 3. spring lombok (for annotaion like getter
	 * and setter ) 4. my sql driver (for mySql data base) 5. spring h2 database (in
	 * memory databse for testing) 6. spring jdbc
	 */

}
