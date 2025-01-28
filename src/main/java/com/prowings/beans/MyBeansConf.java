package com.prowings.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

@Configuration
public class MyBeansConf {
	
	@Bean
	public Department dept1()
	{
		Department d1 = new Department();
		d1.setDeptId(555);
		d1.setName("HR");
		return d1;
	}

	@Bean
	@Primary
	public Department dept2()
	{
		Department d2 = new Department();
		d2.setDeptId(777);
		d2.setName("IT");
		return d2;
	}

}
