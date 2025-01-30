package com.prowings.javabasedconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestJavaBasedConfig {
	
	
	public static void main(String[] args) {
		
		System.out.println("main started!!");
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(MyBeansConfigurations.class);

		Mobile m = ctx.getBean("mobile2",Mobile.class);
		System.out.println(m);
		
		
		Radio rd = ctx.getBean(Radio.class);
		System.out.println(rd);

		Television t = ctx.getBean(Television.class);
		System.out.println(t);
		
		System.out.println("main ended!!");
		
	}

}
