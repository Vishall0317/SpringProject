package com.spring.javaconfig.importannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args )
    {
    	ApplicationContext context=new 
    			AnnotationConfigApplicationContext(AppConfig.class);
       
    	System.out.println("---------------------------------------------");
    	Student student=(Student) context.getBean("student");
        System.out.println("Got student object "
        		+ "from the ApplicationContext(Spring Container)");
    	
        System.out.println("Hashcode ->"+student);
    	System.out.println(student.getStudentDetails());
    	

    	System.out.println("---------------------------------------------");
    	Address address=(Address) context.getBean("address");
        System.out.println("Got address object "
        		+ "from the ApplicationContext(Spring Container)");
    	
        System.out.println("Hashcode ->"+address);
    	System.out.println(address.getAddressDetails());
    }
}
