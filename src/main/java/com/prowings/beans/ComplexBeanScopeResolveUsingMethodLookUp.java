package com.prowings.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ComplexBeanScopeResolveUsingMethodLookUp {
	
	public static void main(String[] args) {
		
		System.out.println("main started!!");
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Car car1 = context.getBean("car", Car.class);
		Engine e1 = car1.getEngine();
		Car car2 = context.getBean("car", Car.class);
		Engine e2 = car2.getEngine();
	
		System.out.println("car1 == car2  :"+ (car1==car2));
		System.out.println("engine1 == engine2  :"+ (e1==e2));
		
		System.out.println("main ended!!");

		
	}

}
