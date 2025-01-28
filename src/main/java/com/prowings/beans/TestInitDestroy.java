package com.prowings.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestInitDestroy {
	
	public static void main(String[] args) {
		
		System.out.println("main method started!!!");
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		
		System.out.println("main method ended!!!");
		
		context.close();
	}

}
