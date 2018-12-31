package com.bridgelabz.algorithm;

import org.omg.Messaging.SyncScopeHelper;

import com.bridgelabz.util.Utility;

public class FindYourNumber 
{
	public static void main(String[] args) 
	{
		System.out.println("enter the number that is power of 2");
		int N = Utility.getInt();
		int number = 1;
		int[] array = new int[N];
		for(int i=0 ; i<=N-1 ; i++)
		{
			array[i] = number;
			number++;
		}
		int firstIndex = 0;
		int lastIndex = N-1;
		
	}
	
}
