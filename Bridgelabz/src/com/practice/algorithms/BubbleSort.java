package com.practice.algorithms;

import com.resources.utility.Utility;

public class BubbleSort 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter number of elements you want in your array to sort: ");
		int n = Utility.getInt();
		
		int[] num = Utility.createArray(n);
        
		Utility.bubbleSort(num);
	}

}
