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
			

}
