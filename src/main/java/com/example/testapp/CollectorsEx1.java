package com.example.testapp;

import java.util.stream.Collectors;    
import java.util.List;  
import java.util.ArrayList; 

class Company3
{
	int id;
	String name;
	int cost;
	public Company3(int id, String name, int cost)
	{
		this.id=id;
		this.name=name;
		this.cost=cost;
	}
}
public class CollectorsEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Company3> a=new ArrayList<Company3>();
		a.add(new Company3(1,"Audi",30000));
		a.add(new Company3(2,"BMW",40000));
		a.add(new Company3(3, "Mercedes",50000));
		a.add(new Company3(4,"Honda",20000));
		Double b=a.stream()
				.collect(Collectors.averagingDouble(c->c.cost));
		System.out.println("average: " + b);
	}

}
