package com.spring.xmlconfig.prototype.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args )
    {
        
    	ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/xmlconfig/prototype/scope/scope.xml");
    	Employee emp1=(Employee) context.getBean("emp");
    	System.out.println("My name is "+emp1.getName()+".");
    	System.out.println("My id number is "+emp1.getId()+".");
    	
    	System.out.println("hashcode of emp1 object -> "+ emp1.hashCode());
    	
    	Employee emp2=(Employee) context.getBean("emp");
    	System.out.println("hashcode of emp2 object -> "+ emp2.hashCode());
    	
    }
}
