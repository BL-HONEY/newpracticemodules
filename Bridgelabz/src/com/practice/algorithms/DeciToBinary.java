package com.practice.algorithms;

import com.resources.utility.Utility;

public class DeciToBinary 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter a decimal number to convert into binary: ");
		int n = Utility.getInt();
		
		String s = Utility.toBinary(n);
		System.out.println("Required Binary Equivalent: "+ s);

	}

}