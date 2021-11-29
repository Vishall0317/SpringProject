package com.spring.xmlconfig.singleton.scope;

public class Employee {

	private String name;
	private int id;

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
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ",id=" +id+"]";
	
}
}
