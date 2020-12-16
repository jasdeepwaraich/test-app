package com.example.testapp;

import java.util.ArrayList;
import java.util.List;

public class ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> cars =new ArrayList<String>();
		cars.add("Audi");
		cars.add("BMW");
		cars.add("Mercedes");
		System.out.println("Iterating: ");
		cars.forEach(a->System.out.println(a));
	}

}
