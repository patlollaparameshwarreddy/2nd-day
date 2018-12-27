package com.bridgelabz.util;
import java.util.Random;
import java.util.Scanner;

public class Utility 
{
	static Scanner scanner = new Scanner(System.in);
	public static int getInt() 
	{
		int integerValue = scanner.nextInt();
		return integerValue;
		
	}
	public static double getDouble()
	{
		double doubleValue = scanner.nextDouble();
		return doubleValue;
	}
	public static String getString()
	{
		String stringValue = scanner.next();
		return stringValue;
	}
	public static double getRandomValue()
	{
		Random random = new Random();
		double Random = random.nextDouble();
		return Random;
	}
	public static void primeFactor(int number) 
	{
		for(int i=1;i<=number;i++)
		{
			int count=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if (count==2)
			{
				while(number%i==0)
				{
					System.out.println(i);
				number = number/i;
				
				}
			}
			
			
		}
		
	}
	public static void roots(double a,double b,double c) 
	{
		double delta = ((b*b)-(4*a*c));
		double root1 = (-b+Math.sqrt(delta))/(4*a);
		double root2 = (-b-Math.sqrt(delta))/(4*a);
		System.out.println("1st root of the equation is "+root1);
		System.out.println("1st root of the equation is "+root2);
	}
	public static char[] covetionOfStringToCharacter(String s1) 
	{
		char[] c1 = s1.toCharArray();
		return c1;
	}
	public static double dist(double X, double y)
	{
		double distance =  Math.sqrt(((Math.pow(X, 2))+(Math.pow(y, 2))));
		return distance;
	}
			

}
