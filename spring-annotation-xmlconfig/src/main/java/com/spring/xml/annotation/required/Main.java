package com.spring.xml.annotation.required;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/spring/xml/annotation/required/autoconfig.xml");
		Mobile mobile=(Mobile) context.getBean("mob");
		System.out.println("Mobile Company -> "+mobile.getCompany());
		System.out.println("Ram -> "+mobile.getRam());
		System.out.println("Rom -> "+mobile.getRom());
		
		context.close();

	}

}
