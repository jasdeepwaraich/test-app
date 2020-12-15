package com.example.testapp;

import java.util.stream.*;
public class JavaStreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream.iterate(1,x->x+1)
		.filter(x->x%3==0)
		.limit(7)
		.forEach(System.out::println);
	}

}
