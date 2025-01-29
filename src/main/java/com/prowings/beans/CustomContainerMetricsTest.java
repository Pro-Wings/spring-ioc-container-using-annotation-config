package com.prowings.beans;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

public class CustomContainerMetricsTest {
	
	public static void main(String[] args) {
		
		System.out.println("main started!!");
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Number of total beans in the container
		
		int totalBeans = context.getBeanDefinitionCount();
		System.out.println("Number of total Beans in container : "+totalBeans);
		
		String[] beanNames = context.getBeanDefinitionNames();
		System.out.println("Bean Names in the container : "+Arrays.toString(beanNames));
		
		String[] deptBeanNames = context.getBeanNamesForType(Department.class);
		System.out.println("Department BeanCount : "+deptBeanNames.length);
		System.out.println("Department BeanNames : "+Arrays.toString(deptBeanNames));
		
		System.out.println("main ended!!");

		
	}

}
