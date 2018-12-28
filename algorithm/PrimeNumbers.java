package com.bridgelabz.algorithm;

import com.bridgelabz.util.Utility;

public class PrimeNumbers 
{
	public static void main(String[] args) 
	{
		System.out.println("enter a range to find prime numbers");
		int range =  Utility.getInt();
		Utility.primeFactor1(range);
		
	}

	
}
