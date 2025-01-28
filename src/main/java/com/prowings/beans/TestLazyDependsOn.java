package com.prowings.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestLazyDependsOn {
	
	public static void main(String[] args) {
		
		System.out.println("main started!!");
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println("main ended!!");
		
	}

}
