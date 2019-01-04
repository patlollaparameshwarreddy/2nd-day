package com.bridgelabz.util;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import javax.rmi.CORBA.Util;

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
	public static ArrayList<Integer> primeFactor1(int number) 
	{
		ArrayList< Integer> arrayList = new ArrayList<>();
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
				arrayList.add(i);
			}
		}
		return arrayList;
		
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
public static void binarySearchOfAStringInaFile() throws FileNotFoundException
{
	File file = new File("/home/admin1/Desktop/newfile.txt");
	Scanner scanner =new Scanner(file);
	String name = scanner.nextLine();
	String[] array = name.split(",");
	Arrays.sort(array);
	System.out.println("enter search element");
	String search = Utility.getString();
	int firstIndex = 0;
	int lastIndex = array.length-1;
	while(firstIndex<=lastIndex)
	{
		int middle = (firstIndex+lastIndex)/2;
		if(search.compareTo(array[middle])==0)
		{
			System.out.println("the element fount at "+(middle));
			break;
		}
		else if (search.compareTo(array[middle])>0) 
		{
			firstIndex = middle+1;
		}
		else
		{
			lastIndex = middle-1;
		}	
		
	}
}
public  static boolean getBoolean()
{
	boolean b = scanner.nextBoolean();
	return b;
}

	public static void temperatureConertion() 
	{
		System.out.println("enter 1 to convert Celsius to Fahrenheit or enter 2 to convert Fahrenheit to Celsius ");
		int i = Utility.getInt();
		switch (i) 
		{
		case 1:
			System.out.println("enter temperature in Celsius");
			double c = Utility.getDouble();
			double f = (c*9/5)+32;
			System.out.println("temperature in fahrenheit is "+f);
			
			break;
		case 2:
			System.out.println("enter temperature in Fahrenheit ");
			int f1 = Utility.getInt();
			int c1 = (f1-32)*5/9;
			System.out.println("temperature in Celsius  is "+c1);
			
			break;
			

		default:
			break;
		}	
	}
	public static void dayOfWeek() 
	{
		String[] week = {"Sunday","monday","tuesday","wednesday","thrusday","friday","saturday"};
		System.out.println("enter year");
		int y = Utility.getInt();
		System.out.println("enter month");
		int m = Utility.getInt();
		System.out.println("enter day");
		int d = Utility.getInt();
		int y0 = y-(14-m)/12;
		int x = y0+(y0/4)-(y0/100)+(y0/400);
		int m0 = m+(12*((14-m)/12))-2;
		int d0 = (d+x+(31*m0)/12)%7;
		System.out.println(week[d0]);
	}
	public static void monthlyPayments()
	{
		System.out.println("enter principle");
		int p = Utility.getInt();
		System.out.println("enter year");
		int y = Utility.getInt();
		System.out.println("enter rate of intrest");
		double R = Utility.getDouble();
		int n = 12*y;
		double r = R/(12*100);
		double payment = (p*r)/(1-Math.pow(1+r,-n));
		System.out.println("monthlypayment is "+payment);
	}
	public static void toBinary() 
	{
		System.out.println("enter decimal number");
		int number = Utility.getInt();
		int temp = number;
		int rem;
		String result = "" ;
		int decimal = 0;
		while(number>=1)
		{
			rem = number%2;
			result = rem+result;
			number = number/2;
		}
		System.out.println("binary representation of "+temp+" is "+result);
		int index = 0;
		for(int i=result.length()-1;i>=0;i--)
		{
			char output = result.charAt(index);
			index++;
			int convertedNumber = Character.getNumericValue(output);
			decimal = (int) (convertedNumber*Math.pow(2, i)+decimal);
			
		}
		
		if (temp==decimal)
		{
			System.out.println("decimal and binary numbers are equal");
		}
		else 
		{
			System.out.println("decimal and binary numbers are not equal");
		}
	}
	public static void toBinary1()
	{
		System.out.println("enter decimal number");
		int number = Utility.getInt();
		int temp = number;
		int rem;
		String result = "" ;
		int decimal = 0;
		while(number>=1)
		{
			rem = number%2;
			result = rem+result;
			number = number/2;
		}
		result = 0+result;
		//System.out.println(result);
		String nibble1 = result.substring(0,4);
		//System.out.println(nibble1);
		String nibble2 = result.substring(4);
		//System.out.println(nibble2);
		String newBinary = nibble2.concat(nibble1);
		//System.out.println(newBinary);
		int index = 0;
		int sum = 0;
		for(int i=newBinary.length()-1;i>=0;i--)
		{
			char j = newBinary.charAt(index);
			index++;
			int num = Character.getNumericValue(j);
			sum = (int) (num*Math.pow(2, i)+sum);
			
		}
		System.out.println(sum);
	}
public static void binarySearchThroughFile() throws FileNotFoundException
{
	File file = new File("/home/admin1/Downloads/test.txt");
	Scanner scanner = new Scanner(file);
	int[] array = new int[100];
	int index=0;
	while(scanner.hasNextInt())
	{
		array[index] = scanner.nextInt();
		index++;
	}
	for(int i=0;i<=index-1;i++)
	{
		for (int j = 0; j <=index-2; j++) 
		{
			if (array[j]>array[j+1]) 
			{
				int temp = array[j];
				array[j]= array[j+1];
				array[j+1]=temp;
				
			}
		}
	}
	for(int i=0;i<=index-1;i++)
	{
		System.out.println(array[i]);
	}
	
}
public static void insertionSortOfAFile() throws IOException
{
	File file = new File("/home/admin1/Downloads/insertionsortfile.txt");
	file.createNewFile();
	FileWriter fileWriter = new FileWriter(file);
	fileWriter.write("mno ijk abc xyz pqr efg ");
	fileWriter.flush();
	fileWriter.close();
	Scanner scanner = new Scanner(file);
	String input = scanner.nextLine();
	String[] inpurtSort  = input.split(" ");
	Arrays.sort(inpurtSort);
	for(int i=1;i<=inpurtSort.length-1;i++)
	{
		String value = inpurtSort[i];
		int index = i;
		while(index>0 && inpurtSort[index-1].compareTo(inpurtSort[index])>1)
		{
			inpurtSort[index] = inpurtSort[index-1];
			index--;
		}
		inpurtSort[index] = value;
		
	}
	for(String k:inpurtSort)
	{
		System.out.println(k);
	}
	
}
public static void sqrt()
{
	System.out.println("enter number");
	double c = Utility.getDouble();
    double epsilon = 1e-15;  
     double t = c;              
    while (Math.abs(t - c/t) > epsilon*t) {
        t = (c/t + t) / 2.0;
    }

    System.out.println(t);

}
public static void palindromeOfPrimeNumbers()
{
	System.out.println("enter a range to find palindrome prime numbers");
	int range =  Utility.getInt();
	ArrayList<Integer> arrayList = Utility.primeFactor1(range);
	System.out.println("prime numbers");
	System.out.println(arrayList);
	System.out.println("====================================================");
	System.out.println("palindrome prime numbers");
	System.out.println("====================================================");
	for(int i=0;i<=arrayList.size()-1;i++)
	{
		int result = 0;
		int num = arrayList.get(i);
		int temp = num;
		if(num>=2 && num<=9)
		{
			result = num;
		}
		else 
		{
			while(num>=1)
			{
				int rem = num%10;
				result = (result*10)+rem;
				num = num/10;
			}
		}
		if(result==temp)
		{
			System.out.println(result+" ");
		}
	}

}
public static void anagramOfPrimeNumbers()
{
	System.out.println("enter a range to find palindrome prime numbers");
	int range =  Utility.getInt();
	ArrayList<Integer> arrayList = Utility.primeFactor1(range);
	System.out.println("====================================================");
	System.out.println("prime numbers that are Anagram  ");
	System.out.println("====================================================");
	for(int i=0;i<=arrayList.size()-1;i++)
	{
		for(int j=i+1;j<=arrayList.size()-1;j++)
		{
			int pro1=1,pro2=1;
			int num1 = arrayList.get(i);
			int temp = num1;
			//System.out.println(temp);
			int num2 = arrayList.get(j);
			int temp1 = num2;
			//System.out.println(temp1);
			//System.out.println("============");
			if(num1!=num2)
			{
				String s1 = num1+"";
				String s2 = num2+"";
				if(s1.length()==s2.length())
				{
			while(num1>=1)
			{
				int rem = num1%10;
				pro1 = pro1*rem;
				num1=num1/10;
			}
			while(num2>=1)
			{
				int rem = num2%10;
				pro2 = pro2*rem;
				num2=num2/10;
			}
			if(pro1==pro2)
			{
				int num = temp1;
				int result=0;
				while(num>=1)
				{
					int rem = num%10;
					result = (result*10)+rem;
					num = num/10;
				}
				if(temp==result)
				System.out.println(temp+" "+temp1);
			}
			}
			}
			
		}
		
	}

}
	
	
}
	
			


