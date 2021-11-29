package com.spring.xml.annotation.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/xml/annotation/autowire/autoconfig.xml");
        Student student=(Student) context.getBean("student");
    	System.out.println(student);
    	
    }
}
