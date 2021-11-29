package com.spring.xmlconfig.autowire.constructor;

public class Employee {

	
	private Project project;

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public Employee() {
		super();
		
	}

	public Employee(Project project) {
		super();
		this.project = project;
	}

	@Override
	public String toString() {
		return "Employee [project=" + project + "]";
	}

	
	
}
