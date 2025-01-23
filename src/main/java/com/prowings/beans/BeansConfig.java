package com.prowings.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfig {
	
	@Bean
	public Student getStudent()
	{
		Student s1 = new Student();
		s1.setRollNumber(100);
		s1.setName("Rams");
		s1.setAddress("Chennai");
		
		return s1;
	}

}
