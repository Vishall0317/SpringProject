package com.spring.annotation.component.value;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("firststudent")
public class Student {
	
	@Value("10123")
	private int id;
	@Value("pasha")
	private String name;
	@Value("nagpur")
	private String city;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
		return "Student [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
}
