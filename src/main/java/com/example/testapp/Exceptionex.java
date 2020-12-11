package com.example.testapp;

class InvalidProduct extends Exception
{
	public InvalidProduct(String s)
	{
		super(s);
	}
}
public class Exceptionex {
	void checkweight(int w) throws InvalidProduct
	{
		if(w<100)
		{
			throw new InvalidProduct("Invalid");
		}
	}
	public static void main(String args[])
	{
		Exceptionex ob= new Exceptionex();
		try
		{
			ob.checkweight(60);
		}
		catch(InvalidProduct ex)
		{
			System.out.println("Exception caught");
			System.out.println(ex.getMessage());
		}
	}

}
