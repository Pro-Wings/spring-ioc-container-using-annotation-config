package com.prowings.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringSpELDemo {
	
	public static void main(String[] args) {
		
		System.out.println("main started!!");

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Math m = context.getBean(Math.class);
		
		m.display();
		
		System.out.println("main ended!!");
		
	}

}
