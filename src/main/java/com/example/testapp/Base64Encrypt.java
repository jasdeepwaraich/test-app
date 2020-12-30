package com.example.testapp;

import java.util.Base64;



//import org.apache.tomcat.util.codec.binary.Base64;
 
public class Base64Encrypt {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte a[]= {1,2,3,4};
		Base64.Encoder b = Base64.getEncoder();
		byte c[]=b.encode(a);
		System.out.println("Encoded array: " + c);
		byte d[]=new byte[20];
		int e=b.encode(a,d);
		System.out.println("Encoded array : " + d);
		
	
	}

}
