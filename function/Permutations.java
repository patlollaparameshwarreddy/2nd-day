package com.bridgelabz.function;

import java.util.Random;
public class Permutations 
{
	private static void swap(char[] ch, int i, int j)
	{
		char temp = ch[i];
		ch[i] = ch[j];
		ch[j] = temp;
	}

	// Recursive function to generate all permutations of a String
	private static void permutations(char[] ch, int currentIndex)
	{
		if (currentIndex == ch.length - 1) 
		{
			System.out.println(String.valueOf(ch));
		}

		for (int i = currentIndex; i < ch.length; i++)
		{
			swap(ch, currentIndex, i);
			permutations(ch, currentIndex + 1);
			swap(ch, currentIndex, i);
		}
	}

	// generate all permutations of a String in Java
	public static void main(String[] args)
	{
		String s = "abc";
		permutations(s.toCharArray(), 0);
	}
}
