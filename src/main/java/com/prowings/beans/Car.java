package com.prowings.beans;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Lazy
//@DependsOn("employee")
@Scope("singleton")
public class Car {
	@Value("111")
	private int id;
	@Value("Hector")
	private String name;
	@Value("MG")
	private String company;

	private Engine engine;
	
	public Car() {
		System.out.println(">>>>>>> car's constructor invoked!!!");
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
		System.out.println(">>>>>>> car's setter for id invoked!!!");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		System.out.println(">>>>>>> car's setter for name invoked!!!");
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
		System.out.println(">>>>>>> car's setter for company invoked!!!");
	}
	@Lookup
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	@Override
	public String toString() {
		return "Car [id=" + id + ", name=" + name + ", company=" + company + "]";
	}
}
