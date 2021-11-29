package com.spring.javaconfig.importannotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

	
	@Bean(name= {"student","temp","con","etc"})
	public Student getStudent() {
		
		Student student=new Student(10001,"raaja");
		
		return student;
		
	}
}
