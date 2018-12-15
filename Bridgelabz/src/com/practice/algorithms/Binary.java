package com.practice.algorithms;

import com.resources.utility.Utility;

public class Binary 
{

	public static void main(String[] args) 
	{
	 System.out.println("Enter a decimal number to create a number out of it: ");
	 int num = Utility.getInt();
	 
	 int swapped= Utility.createNew(num);
	 
	 System.out.println("New number: "+ swapped);

	}

}
