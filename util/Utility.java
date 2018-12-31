package com.bridgelabz.util;
import java.util.Arrays;
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
	public static void BinarySearchOfIntegers()
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
		long startTime = System.nanoTime();
		long stopTime = 0;
		while(firstIndex<=lastIndex)
		{
	
			middle = (firstIndex+lastIndex)/2;
			if(array[middle] == search)
			{
				stopTime = System.nanoTime();
				System.out.println("element found at "+middle);
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
		System.out.println("time taken for searching of integer in binary search "+(stopTime-startTime));
		
	}
	public static String getNextLine()
	{
		String s1 = scanner.nextLine();
		return s1;
	}
	public static void binarySearchOfString()
	{
		System.out.println("enter string ");
		String first = Utility.getNextLine();
		String[] sort1 = first.split(" ");
		Arrays.sort(sort1);
		for(String k:sort1)
		System.out.println(k);
		System.out.println("enter string to sort");
		String Search = Utility.getString();
		int firstIndex = 0;
		int lastIndex = sort1.length-1;
		long startTime = System.nanoTime();
		long stopTime = 0;
		while(firstIndex<=lastIndex)
		{
			int mid = (lastIndex+firstIndex)/2;
			if (Search.compareTo(sort1[mid])==0) 
			{
				stopTime = System.nanoTime();
				System.out.println("search element found at "+(mid+1));
				break;
				
			}
			if (Search.compareTo(sort1[mid])>0)
			{
				firstIndex= mid+1;
			}
			else
			{
				lastIndex = mid-1;
			}
		}
		System.out.println("time taken for searching of string in binary search "+(stopTime-startTime));
	}
	public static void insertionSortOfInteger() 
	{
		System.out.println("enter number of elements");
		int n = Utility.getInt();
		int[] array = new int[n];
		System.out.println("array elements");
		for (int i = 0; i < array.length; i++) 
		{
			 array[i] = Utility.getInt();
			
		}
		long startTime = System.nanoTime();
		long StopTime = 0;
		for(int j=1;j<=array.length-1;j++)
		{
		   int value = array[j];
		   int index = j;
		   while(index>0 && array[index-1]>value)
		   {
			   array[index] = array[index-1];
			   index--;
		   }
		   array[index]=value;
		}
		StopTime = System.nanoTime();
		for (int i = 0; i < array.length; i++) 
		{
			 System.out.println(array[i]); 
			
		}
		System.out.println("time taken for insertion sort of integer "+(StopTime-startTime));
		
		
	}
	public static void insertionSortOfString() 
	{
		System.out.println("enter string ");
		String enteredString = Utility.getNextLine();
		String[] arrayString = enteredString.split(" ");
		Arrays.sort(arrayString);
		long startTime = System.nanoTime();
		long StopTime = 0;
		for(int i = 1;i<=arrayString.length-1;i++)
		{
			String first = arrayString[i];
			int index = i;
			while((index>0) && (arrayString[index-1].compareTo(arrayString[index])>0))
			{
				arrayString[index] = arrayString[index-1];
				index-=1;
			}
			arrayString[index] = first;
		}
		StopTime = System.nanoTime();
		for(int j=0 ; j<= arrayString.length-1 ;j++)
		{
			System.out.println(arrayString[j]);
		}
		
		System.out.println("time taken for insertion sort of String "+(StopTime-startTime));
	}
	public static void bubbleSortOfInteger() 
	{
		System.out.println("enter number of intergers");
		int n = Utility.getInt();
		int[] array = new int[n];
		System.out.println("enter integers");
		for(int i=0 ;i<=array.length-1; i++)
		{
			array[i] = Utility.getInt();
			
		}
		long startTime = System.nanoTime();
		long StopTime = 0;
		for(int j=0;j<=array.length-1;j++)
		{
			for(int k=0;k<=array.length-2;k++)
			{
				if(array[k]>array[k+1])
				{
					int temp = array[k];
					array[k] = array[k+1];
					array[k+1] = temp;
				}
			}
		}
		StopTime = System.nanoTime();
		for(int index = 0;index<=array.length-1;index++)
		{
			System.out.println(array[index]);
		}
		System.out.println("time taken for bubble sort of integer "+(StopTime-startTime));
		
	}
	public static void bubbleSortOfString()
	{
		System.out.println("enter string");
		String EnteredString = Utility.getNextLine();
		String[] array = EnteredString.split(" ");
		long startTime = System.nanoTime();
		long StopTime = 0;
				for(int j=0;j<=array.length-1;j++)
				{
					for(int k=0;k<=array.length-2;k++)
					{
						if(array[k].compareTo(array[k+1])>0)
						{
							String temp = array[k];
							array[k] = array[k+1];
							array[k+1] = temp;
						}
					}
				}
				StopTime = System.nanoTime();
				for(int index = 0;index<=array.length-1;index++)
				{
					System.out.println(array[index]);
				}	
				System.out.println("time taken for bubble sort of String "+(StopTime-startTime));
	}


		
	
}
	
			


