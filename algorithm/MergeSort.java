package com.bridgelabz.algorithm;

import java.text.BreakIterator;

public class MergeSort 
{
	public static void main(String[] args) 
	{
		int[] array = {50,60,20,70,56,84,14,32};
		mergeSort(array);
		//for(int k:array)
		//{
			//System.out.println(k);
		//}
		
	}
	private static void mergeSort(int[] array)
	{
		int n = array.length-1;
		if (n<2)
		{
			return;
		}
		int firstIndex = 0;
		int lastIndex = array.length-1;
		int middleIndex = (firstIndex+lastIndex)/2;
		int[] left = new int[middleIndex+1];
		int[] right = new int[array.length-middleIndex-1];
		for(int i=0;i<=left.length-1;i++)
		{
			left[i] = array[i];
		}
		for(int j=middleIndex+1,index=0;j<array.length;j++,index++)
		{
			right[index] = array[j];
		}
		for(int k:left)
		{
			System.out.println(k);
		}
		System.out.println("============================");
		for(int k:right)
		{
			System.out.println(k);compute
		}
		mergeSort(left);
		mergeSort(right);
		merge(left,right,array);
			
	}
	public static void merge(int[] left,int[] right,int[] array)
	{
		int leftLength = left.length;
		int rightLength = right.length;
		int i=0,j=0,k=0;
		while(i<leftLength && j<rightLength)
		{
			if (left[i]<right[j])
			{
				array[k] = left[i];
				k++;
				i++;
				
			}
			else
			{
				array[k] = right[j];
				k++;
				j++;
			}
			k++;
		}
		while(i<leftLength)
		{
			array[k]=left[i];
			k++;
			i++;
		}
		while(i<rightLength)
		{
			array[k]=left[j];
			k++;
			j++;
		}
		
	}

}
