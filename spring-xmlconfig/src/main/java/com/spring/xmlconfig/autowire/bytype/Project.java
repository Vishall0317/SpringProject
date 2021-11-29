package com.spring.xmlconfig.autowire.bytype;

public class Project {

	private String projectName;
	private String category;
	
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "Project [projectName=" + projectName + ", category=" + category + "]";
	}
	
	
}
