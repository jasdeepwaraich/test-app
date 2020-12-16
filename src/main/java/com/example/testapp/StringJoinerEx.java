package com.example.testapp;

import java.util.StringJoiner; 
public class StringJoinerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringJoiner a=new StringJoiner(",");
		a.add("Audi");
		a.add("BMW");
		a.add("Mercedes");
		a.add("Hyundai");
		System.out.println(a);
	}

}
