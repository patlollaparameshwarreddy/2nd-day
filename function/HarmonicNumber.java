package com.bridgelabz.function;
import com.bridgelabz.util.Utility;
public class HarmonicNumber 
{
	public static void main(String[] args) 
	{
		System.out.println("enter n th number");
		int n = Utility.getInt();
		float sum=0;
		for (int i = 1; i<=n; i++) 
		{
		
			sum=sum+(float)1/i;
		
			
		}
		System.out.println("Nth harmonic number is "+sum);
		
		
	}

}
