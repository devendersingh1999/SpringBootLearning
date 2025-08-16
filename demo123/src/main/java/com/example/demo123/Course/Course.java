package com.example.demo123.Course;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course {

	@Id
	long id;
	String name;
	String author;
	
	// JPA will always use the no-arg constructor (never the parameterized one).
	// After creating the object, it sets fields directly (using reflection) 
	// or via setters, depending on access strategy.
	// The parameterized constructor is only for developer convenience 
	// (to quickly create objects in code).
	public Course() {
		super();
	}

	public Course(long id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
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

}
