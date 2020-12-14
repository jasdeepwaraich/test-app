package com.example.testapp;

interface Textable
{
	Text getText(String txt);
}
class Text
{
	Text(String txt)
	{
		System.out.print(txt);
	}
}
public class ConstructorRef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Textable a=Text::new;
		a.getText("Hi");

	}

}
