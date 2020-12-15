package com.example.testapp;

interface A
{
	default void b()
	{
		System.out.println("Hi");
	}
	void c(String txt);
}
public class DefaultMeth implements A{

	public void c(String txt)
	{
		System.out.println(txt);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultMeth x=new DefaultMeth();
		x.b();
		x.c("Hello");
	}

}
