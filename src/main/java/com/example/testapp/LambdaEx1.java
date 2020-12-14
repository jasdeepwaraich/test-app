package com.example.testapp;

interface Speak
{
	public String say(String name);
}
public class LambdaEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Speak s1=(name)->{
			return name;
		};
		System.out.println(s1.say("jasdeep"));

	}

}
