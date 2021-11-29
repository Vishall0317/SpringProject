package com.spring.xmlconfig.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {

    	System.out.println("Welcome");
        AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/spring/xmlconfig/lifecycle/spring.xml");
       
        Employee e1=(Employee) context.getBean("employee1");
        System.out.println(e1);
        
        Employee e3=(Employee) context.getBean("employee2");
        System.out.println(e3);
        
        //registering shutdown hook
        context.registerShutdownHook();
    }
}
