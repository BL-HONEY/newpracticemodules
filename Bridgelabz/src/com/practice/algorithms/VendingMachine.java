package com.practice.algorithms;

import com.resources.utility.Utility;

public class VendingMachine
{

	public static void main(String[] args)
	{
		System.out.println("Enter an amount you want to dispense: ");
		int amount = Utility.getInt();
		
		Utility.numberOfNotes(amount);
	}

}
