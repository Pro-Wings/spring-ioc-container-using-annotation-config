package com.prowings.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class Person {

	private int id;
	private String name;
	private int age;

	public Person() {
		super();
		System.out.println(">>>>>> Person's constructor invoked!!");
	}

	@PostConstruct
	public void myInit()
	{
		System.out.println("----->> Inside myInit() <<-----");
	}

	@PreDestroy
	public void myDestroy()
	{
		System.out.println("----->> Inside myDestroy() <<-----");
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
		System.out.println(">>>>>> Person's setter-id invoked!!");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println(">>>>>> Person's setter-name invoked!!");
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
		System.out.println(">>>>>> Person's setter-age invoked!!");
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

}
