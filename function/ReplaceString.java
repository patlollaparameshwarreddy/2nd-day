package com.bridgelabz.function;
import com.bridgelabz.util.Utility;

public class ReplaceString 
{
	public static void main(String[] args) 
	{
		System.out.println("enter user name");
		String userName = Utility.getString();
		String  stringTemplate = "Hello <<UserName>>, How are you?";
		if (userName.length()>=3) 
		{
			String replacedString = stringTemplate.replace("<<UserName>>",userName);
			System.out.println(replacedString);
			
		}
		else 
		{
			System.out.println("enter user name with more than or equal to three characters");
		}
		
	}
	

}
