package com.bridgelabz.function;
import com.bridgelabz.util.Utility;

public class LeapYear 
{
	public static void main(String[] args) 
	{
		System.out.println("enter year to check leap year");
		String s1 = Utility.getString();
		int year = Integer.parseInt(s1);
		if (s1.length()==4) 
		{
			if (year%4==0) 
				System.out.println(year+" is a leap year");
			else 
				System.out.println(year+" is not a leap year");
		}
		else 
			System.out.println("enter year in yyyy formate");
		
	}

}
