package com.bridgelabz.algorithm;
import java.io.FileNotFoundException;

import com.bridgelabz.util.Utility;

public class BinarySearchOfWordFromFile 
{
	public static void main(String[] args)
	{
		try {
			Utility.binarySearchOfAStringInaFile();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
