package com.bridgelabz.algorithm;

import java.io.Externalizable;

import com.bridgelabz.util.Utility;

public class VendingMachine 
{
	public static void main(String[] args) 
	{
		  System.out.println("enter rupees");
		  int rupees = Utility.getInt();
		  int sum = 0;
		  int[] notes = {1000,500,100,50,20,10,5,2,1};
		  for (int i = 0; i < notes.length; i++) 
		  {
			  while(rupees/notes[i]>0)
			  {
				  int numberOfNote = rupees/notes[i];
				  rupees = rupees%notes[i];
				  sum = sum+numberOfNote;
				  System.out.println("number of "+notes[i]+"'s are "+numberOfNote);
			  }
			  
			
		  }
		  System.out.println("minimum number of notes "+sum);
	}

}
