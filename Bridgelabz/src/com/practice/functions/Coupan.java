package com.practice.functions;

import com.resources.utility.Utility;

public class Coupan
{

	public static void main(String[] args)
	{
	  System.out.println("Enter number of coupans you want: ");
	  int totalCoupans = Utility.getInt();
	  
	   int[] coupans = Utility.createArray(totalCoupans);
	   
	  System.out.println("Turns it took to find all coupans: "+Utility.findTotalAttempts(coupans));  
	}

}
