package com.spring.xmlconfig.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {

	private String name;
	private List<Long> phoneNo;
	private Set<String> address;
	private Map<String, String>courses;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Long> getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(List<Long> phoneNo) {
		this.phoneNo = phoneNo;
	}
	public Set<String> getAddress() {
		return address;
	}
	public void setAddress(Set<String> address) {
		this.address = address;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", phoneNo=" + phoneNo + ","
				+ " address=" + address + ", courses=" + courses	+ "]";
	
}
}
