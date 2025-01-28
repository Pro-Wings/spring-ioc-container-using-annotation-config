package com.prowings.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Engine {

	@Value("1000")
	private int cc;
	@Value("V12")
	private String type;

	public Engine() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getCc() {
		return cc;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Engine [cc=" + cc + ", type=" + type + "]";
	}

}
