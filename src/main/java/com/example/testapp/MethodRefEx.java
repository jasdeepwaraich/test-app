package com.example.testapp;

interface Speak1
{
	void say();
}
public class MethodRefEx {
	public static void saysome()
	{
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Speak1 a=MethodRefEx::saysome;
		a.say();

	}

}
