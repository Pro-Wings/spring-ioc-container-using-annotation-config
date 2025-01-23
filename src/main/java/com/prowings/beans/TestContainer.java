package com.prowings.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestContainer {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Student s = context.getBean(Student.class);
		
		System.out.println(context.getBeanDefinitionCount());
		
		
		
		System.out.println(">>>>>>>>"+s);
	}

}
