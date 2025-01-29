package com.prowings.javabasedconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.prowings.javabasedconfig"})
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

}
