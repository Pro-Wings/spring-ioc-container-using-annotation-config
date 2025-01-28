package com.prowings.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestContainerForAutowiring {
	
	public static void main(String[] args) {
		
		System.out.println("main method started!!!");
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee e = context.getBean("employee",Employee.class);
		System.out.println("Employee Bean : "+e);

		System.out.println("main method ended!!!");
	}

}
