package com.spring.constructor.args.injection;

public class Person {
	
	private String name;
	private int personId;
	private Address address;
	
	
	public Person(String name, int personId, Address address) {
		
		this.name = name;
		this.personId = personId;
		this.address=address;
	}


	@Override
	public String toString() {
		return this.name+" -> Id= "+this.personId+" "
				+ "-> Address= "+this.address.city+" street= "+this.address.street;
	}
	
	
}
