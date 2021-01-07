package com.example.testapp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class StringhTest {
	@Test
	public void testtruncatefirst2positions()
	{
		Stringh a=new Stringh();
		String b="BBAA";
		String c=a.truncatefirst2positions("BBAA");
		assertEquals(b,c);
	}

}
