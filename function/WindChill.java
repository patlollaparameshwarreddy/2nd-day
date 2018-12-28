package com.bridgelabz.function;

import com.bridgelabz.util.Utility;

public class WindChill 
{

	public static void main(String[] args)
	{
		System.out.println("enter temperature in Fahrenheit up to 50F");
		double t = Utility.getDouble();
		System.out.println("enter wind speed");
		double v = Utility.getDouble();
		Utility.windChill(t,v);
		
	}
}
