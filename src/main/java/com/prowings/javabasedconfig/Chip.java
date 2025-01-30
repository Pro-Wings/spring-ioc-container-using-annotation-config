package com.prowings.javabasedconfig;

import org.springframework.stereotype.Component;

@Component
public class Chip {
	
	private int id;
	private String companyName;
	public Chip() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	@Override
	public String toString() {
		return "Chip [id=" + id + ", companyName=" + companyName + "]";
	}
}
