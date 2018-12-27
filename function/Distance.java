package com.bridgelabz.function;

import org.omg.CORBA.PUBLIC_MEMBER;

import com.bridgelabz.util.Utility;

public class Distance 
{
	public static void main(String[] args) 
	{
		System.out.println("enter x value");
		double x = Utility.getDouble();
		System.out.println("enter y value");
		double y = Utility.getDouble();
	   double distance =  Utility.dist(x,y);
	   System.out.println("distance between a point(x,y) and a origin is "+distance);
		
		
	}

}
