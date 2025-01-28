package com.prowings.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class ClassA {
	
	private final ClassB b;

	public ClassA(@Lazy ClassB b) {
		super();
		this.b = b;
	}
	
	public void doSomething()
	{
		System.out.println("inside doSomething of ClassA!!");
	}

}
