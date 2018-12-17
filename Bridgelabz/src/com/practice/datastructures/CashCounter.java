package com.practice.datastructures;

import com.resources.utility.Queue;
import com.resources.utility.Utility;

public class CashCounter 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the number of customers in queue: ");
		int customers = Utility.getInt();
		Utility.validate(customers);
		
		
		
		Queue.maintainCash(customers);

	}

}
