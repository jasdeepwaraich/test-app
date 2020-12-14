package com.example.testapp;
import java.io.FileOutputStream;
public class FileOutputEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{    
            FileOutputStream fout=new FileOutputStream("D:\\test.txt");    
            String s="Jasdeep Singh";    
            byte b[]=s.getBytes();    
            fout.write(b);    
            fout.close();    
            System.out.println("success");    
          }
		catch(Exception e)
		{
			System.out.println(e);
			
		} 
	}

}
