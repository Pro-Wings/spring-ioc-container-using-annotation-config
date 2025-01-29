package com.prowings.javabasedconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Television {

	@Value("111")
	private int id;
	@Value("LG")
	private String company;
	@Value("45")
	private int size;

	public Television() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Television [id=" + id + ", company=" + company + ", size=" + size + "]";
	}

}
