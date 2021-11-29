package com.spring.xmlconfig.autowire.byname;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/xmlconfig/autowire/byname/autoconfig.xml");
		
		System.out.println("implementing byName mode");
		Employee e1=(Employee) context.getBean("employee1");
		
		//or
		//Employee e1=context.getBean("employee1",Employee.class);
		System.out.println(e1);
		
	
	}

}
