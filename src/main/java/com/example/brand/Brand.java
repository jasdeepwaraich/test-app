package com.example.brand;

public class Brand {

	private String company;
	private String name;
	
	public Brand() {
		
	}
	public Brand(String company, String name) {
		super();
		this.company = company;
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
