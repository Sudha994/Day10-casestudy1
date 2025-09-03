package com.example.model;

public class Course {

	private String id;
	private String title;
	private String instructor;
	private double price;
	
	public Course() {
		// TODO Auto-generated constructor stub
	}

	public Course(String id, String title, String instructor, double price) {
		this.id = id;
		this.title = title;
		this.instructor = instructor;
		this.price = price;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getInstructor() {
		return instructor;
	}

	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
}
