package com.prowings.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfig {
	
	@Bean
	public Student student1()
	{
		Student s1 = new Student();
		s1.setRollNumber(100);
		s1.setName("Rams");
		s1.setAddress("Chennai");
		return s1;
	}
	@Bean
	public Student student2()
	{
		Student s1 = new Student();
		s1.setRollNumber(200);
		s1.setName("Sham");
		s1.setAddress("Dubai");
		return s1;
	}
	@Bean
	public Student student3()
	{
		Student s1 = new Student();
		s1.setRollNumber(300);
		s1.setName("Raju");
		s1.setAddress("Kolhapur");
		return s1;
	}

}
