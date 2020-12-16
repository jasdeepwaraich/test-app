package com.example.testapp;

import java.util.Optional; 
public class OptionalEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] a=new String[20];
		a[2]="JASDEEP";
		Optional<String> b=Optional.ofNullable(a[2]);
		if(b.isPresent())
		{
			String c=a[2].toLowerCase();
			System.out.println(c);
		}
		else
		{
			System.out.println("String not present");
		}
	}

}
