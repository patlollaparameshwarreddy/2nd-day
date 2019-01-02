package com.bridgelabz.algorithm;

import javax.rmi.CORBA.Util;

import org.omg.Messaging.SyncScopeHelper;

import com.bridgelabz.util.Utility;

public class FindYourNumber 
{
	public static void main(String[] args) 
	{
		System.out.println("enter the  the power of 2");
		int n = Utility.getInt();
		int N = (int) Math.pow(2, n);
		int[] array = new int[N];
		for(int i=0 ; i<=N-1 ; i++)
		{
			array[i] = i;
		}
		/*for(int i=0 ; i<=N-1 ; i++)
		{
		 System.out.println(array[i]);
		}*/
		System.out.println("guess the number between 0 and "+( N-1));
		int firstIndex = 0;
		int lastIndex = N-1;
		boolean correct;
		boolean highOrLow;
		Utility.getNextLine();
		Utility.getNextLine();
		while(firstIndex<=lastIndex)
		{
			int middle=(firstIndex+lastIndex)/2;
			
			System.out.println("you number is "+array[middle]+" if yes enter true,else false");
			
			 correct = Utility.getBoolean();
			 if(correct== true)
			 {
				 System.out.println("your guessed number is "+array[middle]);
				 break;
			 }
			 System.out.println("is your number is greater than "+array[middle]+" is yes enter true,else enter false");
			 highOrLow = Utility.getBoolean();
			 if (highOrLow) 
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
