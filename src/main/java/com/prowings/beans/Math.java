package com.prowings.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Math {

	@Value("#{T(java.lang.Math).random() * 100}")  // Random number between 0-100
    private double randomValue;

	@Value("100")
	private int myNumber;

	@Value("#{T(java.util.UUID).randomUUID().toString().substring(0, 16)}")
	private String txnId;
	
	public void display()
	{
		System.out.println("RandomNumber : "+ randomValue);
		System.out.println("MyNumber : "+ myNumber);
		System.out.println("TransactionId : "+ txnId);
		
	}
	
}
