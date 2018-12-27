package com.bridgelabz.function;
import org.omg.Messaging.SyncScopeHelper;

import com.bridgelabz.util.Utility;
public class Quadratic 
{
	public static void main(String[] args) 
	{
		System.out.println("enter a,b,c values");
		int a = Utility.getInt();
		int b = Utility.getInt();
		int c = Utility.getInt();
		Utility.roots(a,b,c);
		
		
	}

}
