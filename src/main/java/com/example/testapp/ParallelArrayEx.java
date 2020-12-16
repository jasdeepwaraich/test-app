package com.example.testapp;

import java.util.Arrays;
public class ParallelArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {9,4,87,3,6,5,7};
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i] + " ");
		}
		Arrays.parallelSort(a,0,4);
		System.out.println();
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i] + " ");
		}
	}

}
