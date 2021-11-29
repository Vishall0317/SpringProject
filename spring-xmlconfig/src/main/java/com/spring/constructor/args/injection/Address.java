package com.spring.constructor.args.injection;

public class Address {

	String city;
	String street;

	public Address(String city,String street) {
		super();
		this.city = city;
		this.street=street;
	}
}
