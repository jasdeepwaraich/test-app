package com.example.testapp;

import java.util.StringJoiner; 
public class StringJoinerEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringJoiner a = new StringJoiner(",", "[", "]"); 
        a.add("Audi");  
        a.add("BMW");    
        StringJoiner b = new StringJoiner(":", "[", "]"); 
        b.add("Maruti");  
        b.add("Hyundai");  
        StringJoiner c = a.merge(b);   
        System.out.println(c); 

	}

}
