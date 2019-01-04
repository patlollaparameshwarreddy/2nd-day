package com.bridgelabz.algorithm;

import java.util.ArrayList;

import com.bridgelabz.util.Utility;

public class PrimeNumbers 
{
	public static void main(String[] args) 
	{
		System.out.println("enter a range to find prime numbers");
		int range =  Utility.getInt();
		ArrayList<Integer> arrayList = Utility.primeFactor1(range);
		System.out.println(arrayList);
		
		
	}

	
}
