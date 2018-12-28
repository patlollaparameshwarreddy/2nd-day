package com.bridgelabz.function;

import java.util.Scanner;

import com.bridgelabz.util.Utility;

public class StopWatch 
{
	long startTime;
	long stopTime;
	
	public void start()
	{
		 startTime = System.currentTimeMillis();
		
	}
	public void stop() 
	{
		 stopTime =System.currentTimeMillis();
	
		
	}
	public static void main(String[] args) 
	{
		StopWatch stopWatch = new StopWatch();
		
		
		System.out.println("enter 0 to start");
		int j = Utility.getInt();
		if (j==0) 
		{
			stopWatch.start();
			System.out.println(stopWatch.startTime);
			
		}
		
		System.out.println("enter 1 to stop");
		int i = Utility.getInt();
		if (i==1)
		{
			stopWatch.stop();
			System.out.println(stopWatch.stopTime);
			
		}
		System.out.println("seconds= "+((stopWatch.stopTime)-(stopWatch.startTime))/1000);
		
		
	}
	
	
}
