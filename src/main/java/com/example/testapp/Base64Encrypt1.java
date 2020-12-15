package com.example.testapp;

import java.util.Base64;
public class Base64Encrypt1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base64.Encoder a = Base64.getEncoder();
		String b=a.encodeToString("Jasdeep".getBytes());
		System.out.println("Encode string: " + b);
		Base64.Decoder c = Base64.getDecoder();
		String d=new String(c.decode(b));
		System.out.println("Decoded string: " + d);
		

	}

}
