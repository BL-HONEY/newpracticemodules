package com.practice.datastructures;

import com.resources.utility.Queue;
import com.resources.utility.Utility;

/**
 * Method to implement queue for maintaining cash balanced
 * @author honey
 *
 */
public class CashCounter 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the number of customers in queue: ");
		
		// Method call to ensure number of customers in queue
		int customers = Utility.getInt();
		
		//Method call to validate number of customers should be positive
		Utility.validate(customers);
		
		
		//Method call to check counter status
		if(Queue.maintainCash(customers))
		{   
			System.out.println("Cash Counter Status: ");
			System.out.println("Cash Balanced");
		}
		else
		{
			System.out.println("Cash Counter Status: ");
			System.out.println("Cash is not balanced");
		}

	}

}
