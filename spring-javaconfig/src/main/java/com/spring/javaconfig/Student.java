package com.spring.javaconfig;

public class Student {

	private Address address;
	

	public Student(Address address) {
		super();
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Student [address=" + address + "]";
	}

	public void study() {
		this.address.display();
		System.out.println("student reading books");
	}
}
