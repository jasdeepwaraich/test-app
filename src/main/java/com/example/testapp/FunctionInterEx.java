package com.example.testapp;

interface textable1
{
	void text1(String txt);
}
public class FunctionInterEx implements textable1 {

	public void text1(String txt)
	{
		System.out.print(txt);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunctionInterEx a=new FunctionInterEx();
		a.text1("Hi");

	}

}
