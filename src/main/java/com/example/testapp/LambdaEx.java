package com.example.testapp;

interface Drawable
{  
    public void draw();  
}  
public class LambdaEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int len=10;  
        
        //with lambda  
        Drawable d2=()->{  
            System.out.println("Drawing "+len);  
        };  
        d2.draw();

	}

}
