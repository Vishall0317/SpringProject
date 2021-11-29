package com.spring.xmlconfig.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args )
    {
        
    	ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/xmlconfig/collections/collection.xml");
    	Employee emp=(Employee) context.getBean("emp1");
    	System.out.println("My name is "+emp.getName()+".");
    	System.out.println(emp.getPhoneNo());
    	System.out.println(emp.getAddress());
    	System.out.println(emp.getCourses());
    	
    }
}
