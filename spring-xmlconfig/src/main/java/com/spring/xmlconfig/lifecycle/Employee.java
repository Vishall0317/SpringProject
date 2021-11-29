package com.spring.xmlconfig.lifecycle;

public class Employee {
	
	private int id;
	private String name;
	private String project;
	private String city;
	
	public Employee(String name, int id, String project, String address) {
		super();
		this.name = name;
		this.id = id;
		this.project = project;
		this.city = address;
	}
	public Employee() {
		
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProject() {
		return project;
	}
	public void setProject(String project) {
		this.project = project;
	}
	public String getAddress() {
		return city;
	}
	public void setAddress(String address) {
		this.city = address;
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", project=" + project + ", address=" + city + "]";
	}
	
	public void hey() {
		System.out.println("inside init method: hey, how are you!");
	}
	
	public void bye() {
		System.out.println("inside destroy method: bye bye!");
	}
	
	

}
