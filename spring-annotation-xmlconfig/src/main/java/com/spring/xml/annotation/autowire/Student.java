package com.spring.xml.annotation.autowire;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	
	private int id;
	private String name;
	private String city;
	
	@Autowired
	private Address address;
	
	public Student() {
	
	}
	public Student(int id, String name, String city, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.address = address;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public Address getAddress() {
		return address;
	}
	
	//@Autowired
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city +", "+ address+"]";
	}
}
