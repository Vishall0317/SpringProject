package com.spring.xmlconfig.autowire.bytype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/xmlconfig/autowire/bytype/autoconfig.xml");
		
		System.out.println("implementing byType mode");
		Employee e2=(Employee) context.getBean("employee2");
	
		System.out.println(e2);
		
	}

}
