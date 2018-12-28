package com.bridgelabz.function;

import com.bridgelabz.util.Utility;

public class TwoDArray 
{
	public static void main(String[] args) 
	{
		System.out.println("enter m and n values");
		int m = Utility.getInt();
		int n = Utility.getInt();
		int[][] array = new int[m][n];
		Utility.enterElements(m, n, array);
		System.out.println("array elements are");
		Utility.diaplayArrayElements(m, n, array);
		
	}

}
