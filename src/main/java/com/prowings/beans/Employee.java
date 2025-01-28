package com.prowings.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	@Value("1010")
	private int id;

	@Value("Engineer Ram")
	private String name;

	@Autowired
	@Qualifier("dept1")
	private Department department; //field injection
	
	public Employee() {
		System.out.println("Employee - no-arg constructor invoked!!");
	}
	
//	@Autowired  //constructor injection
	public Employee(Department department) {
		super();
		System.out.println("Employee - department constructor invoked!!");
		this.department = department;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		System.out.println("Employee - setter for id invoked!!");
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("Employee - setter for name invoked!!");
		this.name = name;
	}
	public Department getDepartment() {
		return department;
	}
	
//	@Autowired
	public void setDepartment(Department department) {
		System.out.println("Employee - setter for department invoked!!");
		this.department = department;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + "]";
	}
}
