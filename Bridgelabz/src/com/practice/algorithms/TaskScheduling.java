package com.practice.algorithms;

import com.resources.utility.Utility;

public class TaskScheduling {

	public static void main(String[] args)
	{
		System.out.println("Enter number of task you want to schedule: ");
		  int num = Utility.getInt();
		  
		  int[] deadLines = Utility.createArray(num);
		  
		  int[] sortedDeadLines = Utility.insertionSort(deadLines);
		  
		  Utility.findCompletionTime(sortedDeadLines);


	}

}
