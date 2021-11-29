package com.spring.constructor.args.injection;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		System.out.println("Welcome");
        AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/spring/constructor/args/injection/ciconfig.xml");
       
        Person p=(Person) context.getBean("person");
        System.out.println(p);
     

	}

}
