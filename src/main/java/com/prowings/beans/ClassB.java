package com.prowings.beans;

import org.springframework.stereotype.Component;

@Component
public class ClassB {

	private final ClassA a;

	public ClassB(ClassA a) {
		super();
		this.a = a;
	}

	public void doSomething() {
		System.out.println("inside doSomething of ClassB!!");
	}

}
