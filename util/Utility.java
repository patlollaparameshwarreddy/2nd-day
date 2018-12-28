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
	public static char[] covetionOfStringToCharacterArray(String s1) 
	{
		char[] c1 = s1.toCharArray();
		return c1;
	}
	public static double dist(double X, double y)
	{
		double distance =  Math.sqrt(((Math.pow(X, 2))+(Math.pow(y, 2))));
		return distance;
	}
	public static void enterElements(int m,int n,int[][] array) 
	{
		
		System.out.println("enter values in to array");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				array[i][j] = Utility.getInt();
			}
		}
		
	}
	public static void diaplayArrayElements(int m,int n,int[][] array) 
	{
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(array[i][j]+"  ");
			}
			System.out.println();
		}
		
	}
	public static void windChill(double t,double v)
	{
		double effectiveTemperature = (35.74+(0.6215*t)+((0.4275*t)-35075)*(Math.pow(v, 0.16)));
		System.out.println("the wind chill "+effectiveTemperature);
	}
	public static void primeFactor1(int number) 
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
				System.out.print(i+" ");
			}
		}
	}
	public static void BinarySearch()
	{
		System.out.println("enter number of elements to enter");
		int n = Utility.getInt();
		System.out.println("enter array elements ");
		int[] array = new int[n];
		for (int i = 0; i < n; i++) 
		{
			array[i] = Utility.getInt();
		}
		int firstIndex = 0;
		int lastIndex = n-1;
		int middle = 0;
		System.out.println("enter search element");
		int search = Utility.getInt();
		while(firstIndex<=lastIndex)
		{
			middle = (firstIndex+lastIndex)/2;
			if(array[middle] == search)
			{
				System.out.println(search +"is found at "+(middle+1)+"position");
				break;
			}
			else if (search>array[middle]) 
			{
				firstIndex = middle+1;
			}
			else 
				{
					lastIndex = middle-1;
				}
		}
		System.out.println(search+" search element is founs at "+(middle+1));
		
	}
}
	
			


