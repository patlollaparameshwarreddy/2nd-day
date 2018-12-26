package com.bridgelabz.function;

import com.bridgelabz.util.Utility;

public class FlipCoin 
{
	 
	public static void main(String[] args) 
	{
		float heads=0;
		float tails=0;
		System.out.println("enter  number of times to Flip Coin");
		int flip = Utility.getInt();
		for(int i=1;i<=flip;i++)
		{
			
			
			if (Utility.getRandomValue()>0.5)
			{
				heads++;
				
			}
			else 
			{
				tails++;
			}
			
		}
		
		
		System.out.println(" Percentage of Head is "+ (heads/flip)*100 + "%");
		System.out.println(" Percentage of tails is "+ (tails/flip)*100 + "%");
		
		
	
	}

}
