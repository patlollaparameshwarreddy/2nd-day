package com.bridgelabz.algorithm;

import java.util.Arrays;

import com.bridgelabz.util.Utility;

public class Anagram 
{
	public static void main(String[] args) 
	{
		System.out.println("enter  first string");
		String s1 = Utility.getString();
		System.out.println("enter second string");
		String s2 = Utility.getString();
		char[] ch1 = Utility.covetionOfStringToCharacterArray(s1);
		char[] ch2 = Utility.covetionOfStringToCharacterArray(s2);
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		String s3 = new String(ch1);
		String s4 = new String(ch2);
		if(s3.equals(s4))
		{
			System.out.println("The Two Strings are Anagram ");
		}
		else
			System.out.println("The Two Strings are not Anagram ");
		
		
		
	}

}
