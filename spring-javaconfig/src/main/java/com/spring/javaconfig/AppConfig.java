package com.spring.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean
	public Address getAddress() {
		return new Address();
	}
	@Bean(name= {"student","temp","con"})
	public Student getStudent() {
		
		Student student=new Student(getAddress());
		return student;
		
	}
}
