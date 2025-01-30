package com.prowings.javabasedconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
//@ComponentScan(basePackages = {"com.prowings.javabasedconfig"})
@ComponentScan(
	    basePackages = "com.prowings.javabasedconfig",
	    excludeFilters = @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = Television.class)
	)
public class MyBeansConfigurations {
	
	@Bean
	public Mobile mobile1()
	{
		Mobile m1 = new Mobile();
		m1.setCompany("Nokia");
		m1.setImie(123123123);
		m1.setPrice(20000);
		return m1;
	}

	@Bean
	public Mobile mobile2()
	{
		Mobile m1 = new Mobile();
		m1.setCompany("Apple");
		m1.setImie(788789823);
		m1.setPrice(200000);
		return m1;
	}

}
