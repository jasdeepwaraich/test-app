package com.example.testapp;

import java.util.*;
class Company
{
	int no;
	String name;
	int cost;
	public Company(int no, String name, int cost)
	{
		this.no=no;
		this.name=name;
		this.cost=cost;
	}
}
public class JavaStreamEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Company> companylist=new ArrayList<Company>();
		companylist.add(new Company(1,"Hp",28000));
		companylist.add(new Company(2,"Dell",30000));
		companylist.add(new Company(3,"Lenovo",25000));
		long count=companylist.stream()
				.filter(company->company.cost<29000)
				.count();
		System.out.println(count);
		
	}

}
