package com.example.testapp;
class Exception1 extends Exception
{
	int data;
	Exception1(int x)
	{
		data=x;
	}
	public String toString()
	{
		return "Exception1: " + data ;
	}
}

public class ExceptionD {

	static void compute(int x) throws Exception1
	{
		if(x>10)
			throw new Exception1(x);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			compute(1);
			compute(20);
		}
		catch(Exception1 e)
		{
			System.out.println("Caught " + e);
		}
		

	}

}
