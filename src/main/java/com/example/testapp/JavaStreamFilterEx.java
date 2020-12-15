package com.example.testapp;

import java.util.*;
import java.util.stream.Collectors;

class Company1
{
	int no;
	String name;
	int cost;
	public Company1(int no, String name, int cost)
	{
		this.no=no;
		this.name=name;
		this.cost=cost;
	}
}
public class JavaStreamFilterEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Company> companylist=new ArrayList<Company>();
		companylist.add(new Company(1,"Hp",28000));
		companylist.add(new Company(2,"Dell",30000));
		companylist.add(new Company(3,"Lenovo",25000));
		List<Integer> costlist=companylist.stream()
				.filter(a->a.cost>20000)
				.map(a->a.cost)
				.collect(Collectors.toList());
		System.out.println(costlist);
		
	}

}
