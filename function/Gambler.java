package com.bridgelabz.function;

import com.bridgelabz.util.Utility;

public class Gambler 
{
	public static void main(String[] args) 
	{
		System.out.println("enter stake value");
		int stake = Utility.getInt();
		System.out.println("enter goal value");
		int goal = Utility.getInt();
		System.out.println("number of times");
		int numberoftimes = Utility.getInt();
		int wins =0;
		int bets = 0;
		for(int i =0;i<numberoftimes;i++)
		{
			int cash=stake;
			while(cash>0&&cash<goal)
			{
				bets++;
				if(Math.random()<0.5)
					cash++;
				else
					cash--;
				
			}
			if(cash==goal)
				wins++;
			
		}
		System.out.println();
		System.out.println(wins+" wins of "+numberoftimes);
		System.out.println(" percentage of wins is "+100.0*wins/numberoftimes);
		System.out.println(" average bets percentage is "+ 1.0*bets/numberoftimes);
	}

}

