package com.spring.javaconfig.importannotation;

public class Student {

	private int id;
	private String name;
	
	public Student(int id, String name) {

		System.out.println("Student constructor call by the spring container");
		this.id = id;
		this.name = name;
	}

	public String getStudentDetails() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
}
