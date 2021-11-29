package com.spring.javaconfig.importannotation;

public class Address {

	private String street;
	private String city;
	
	public Address(String street, String city) {

		System.out.println("Address constructor call by the spring container");

		this.street = street;
		this.city = city;
	}

	public String getAddressDetails() {
		return "Address [street=" + street + ", city=" + city + "]";
	}
}
