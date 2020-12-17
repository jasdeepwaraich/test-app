package com.example.testapp;

import java.util.ArrayList;  
import java.util.List;
public class TypeInferenceEx {
	public static void showList(List<Integer>list){  
        if(!list.isEmpty()){  
            list.forEach(System.out::println);  
        }else System.out.println("Empty");  
    }  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> a = new ArrayList<Integer>();  
        a.add(2);  
        showList(a);     
        List<Integer> b = new ArrayList<>(); 
        b.add(5);  
        showList(b);  
        
        showList(new ArrayList<>()); 

	}

}
