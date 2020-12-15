package com.example.testapp;

public class LambdaEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable a=()->{
			System.out.println("Thread is running");
		};
		Thread t=new Thread(a);
		t.start();

	}

}
