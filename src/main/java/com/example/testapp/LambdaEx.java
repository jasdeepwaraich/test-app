package com.example.testapp;

interface Drawable
{  
    public void draw();  
}  
public class LambdaEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int length=10; 
        Drawable d=new Drawable()
        {  
            public void draw()
            {
            	System.out.println("Drawing "+length);
            	
            }  
        };  
        d.draw(); 

	}

}
