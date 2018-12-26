package com.bridgelabz.function;
import com.bridgelabz.util.Utility;
public class TableOfPower2 
{
public static void main(String[] args) 
{
	System.out.println("enter power");
	int power = Utility.getInt();
	if (power==0) 
	{
		System.out.println(1);
	}
	for(int i=1;i<=power;i++)
	{
		System.out.println((int)Math.pow(2, i));
		
	}
}
}
