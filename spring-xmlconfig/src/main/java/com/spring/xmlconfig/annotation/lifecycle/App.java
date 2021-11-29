package com.spring.xmlconfig.annotation.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.xmlconfig.annotation.lifecycle.Farm;

public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args )
    {
    	System.out.println("Welcome");
        AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/spring/xmlconfig/annotation/lifecycle/spring.xml");
        Farm e1=(Farm) context.getBean("farm");
        System.out.println(e1);
        
     
        context.registerShutdownHook();
    }
}
