package com.example.testapp;

import java.util.stream.Collectors;  
import java.util.Set;  
import java.util.List;  
import java.util.ArrayList; 

class Company2
{
	int id;
	String name;
	int cost;
	public Company2(int id, String name, int cost)
	{
		this.id=id;
		this.name=name;
		this.cost=cost;
	}
}
public class CollectorsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Company2> a=new ArrayList<Company2>();
		a.add(new Company2(1,"Audi",30000));
		a.add(new Company2(2,"BMW",40000));
		a.add(new Company2(3, "Mercedes",50000));
		a.add(new Company2(4,"Honda",20000));
		Set<Integer> b=a.stream()
				.map(c->c.cost)
				.collect(Collectors.toSet());
		System.out.println(b);
	}

}
