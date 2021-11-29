package com.spring.javaconfig.importannotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AddressConfig {

	@Bean(name= {"address","temp","con","etc"})
	public Address getAddress() {
		
		Address address=new Address("seminari hills","nagpur");
		
		return address;
		
	}
}
