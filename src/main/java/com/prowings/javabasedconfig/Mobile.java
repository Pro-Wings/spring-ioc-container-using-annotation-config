package com.prowings.javabasedconfig;

public class Mobile {

	private long imie;
	private String company;
	private double price;

	public Mobile() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getImie() {
		return imie;
	}

	public void setImie(long imie) {
		this.imie = imie;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Mobile [imie=" + imie + ", company=" + company + ", price=" + price + "]";
	}

}
