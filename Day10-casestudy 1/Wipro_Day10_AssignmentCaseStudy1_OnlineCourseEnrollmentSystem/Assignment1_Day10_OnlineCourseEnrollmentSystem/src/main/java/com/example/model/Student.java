package com.example.model;

public class Student {

	private String name;
	private String email;
	private String courseId;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, String email, String courseId) {
		this.name = name;
		this.email = email;
		this.courseId = courseId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCourseId() {
		return courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	
}
