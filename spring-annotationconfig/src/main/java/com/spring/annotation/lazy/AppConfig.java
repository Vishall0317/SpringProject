package com.spring.annotation.lazy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
@ComponentScan(basePackages = "com.spring.annotation.lazy")
public class AppConfig {

	@Bean
	@Lazy
	public Student student() {
		return new Student();
		
	}
	

}
