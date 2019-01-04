package com.bridgelabz.function;

import com.bridgelabz.util.Utility;

public class AddsToZero 
{
	public static void main(String[] args) 
	{
		System.out.println("enter no of elements");
		int n = Utility.getInt();
		int[] array = new int[n];
		System.out.println("enter array elements");
		for (int index = 0; index < array.length; index++) 
		{
			array[index]=Utility.getInt();
		}
		int sum  = 0;
		for (int i = 0; i < array.length; i++) 
		{
			for (int j = 0; j < array.length-1; j++) 
			{
				for (int k = 0; k < array.length-2; k++) 
				{
					if(array[i]+array[j]+array[k]==0)
					{
						sum++;
						System.out.println(" distinct   triplets "+array[i]+","+array[j]+","+array[k]);
					}
					
				}
				
			}
			
		}
		System.out.println();
		System.out.println("number of distinct triplets "+sum);
	}

}
