package com.practice.oops;

import com.resources.utility.Utility;

public class StockReport 
{
	public static void main(String[] args) 
	{
	 System.out.println("Enter number of stocks you want: ");
	 int n = Utility.getInt();
	 
	 Utility.getStockData(n);

	}
}
