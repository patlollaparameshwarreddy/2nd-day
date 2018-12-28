package com.bridgelabz.function;

import java.util.ArrayList;
import java.util.Random;

import com.bridgelabz.util.Utility;

public class CouponNumbers 
{
	public static void main(String[] args) 
	{
		System.out.println("enter n distinct coupon numbers");
		int n = Utility.getInt();
		ArrayList<Integer> a1 = new ArrayList();
		int count = 0;
		for(int i=1;i<=n;i++)
		{
			Random random = new Random();
			count++;
			int coupon = random.nextInt(n);
			System.out.println("coupon numbers is "+coupon);
			if (!a1.contains(coupon)) 
			{
				a1.add(coupon);
			}
			else
				i--;
			
		}
		System.out.println("distinct random numbers");
		for(Integer k:a1)
			System.out.println(k);
		System.out.println("total random number needed to have all distinct numbers is "+count);
		
	}

}
