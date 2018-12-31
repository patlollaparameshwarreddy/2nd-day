package com.bridgelabz.algorithm;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

import com.bridgelabz.util.Utility;

public class BinarySearchOfWordFromFile 
{
	public static void main(String[] args) throws FileNotFoundException 
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
				System.out.println("the element fount at "+(middle+1));
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
}
