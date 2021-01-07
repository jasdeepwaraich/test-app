package com.example.testapp;

public class Stringh {
	public String truncatefirst2positions(String a)
	{
		if(a.length() <=2)
			return a.replaceAll("A","");
		String b=a.substring(0,2);
		String c=a.substring(2);
		return b.replaceAll("A","") + c;
	}

}
