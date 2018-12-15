package com.practice.algorithms;

import com.resources.utility.Utility;

public class BinarySearch
{
	public static void main(String[] args) 
	{
	  System.out.println("Enter number of elements you want: ");
	  int num = Utility.getInt();
	  
	  int[] elements = Utility.createArray(num);
	  
	  int[] sortedElements = Utility.insertionSort(elements);
	  
	  System.out.println("Enter an element to search ");
      int find = Utility.getInt();
      
      int res = Utility.binarySearch(sortedElements,0,sortedElements.length-1,find);
		
		System.out.println("Found at index " + res + ": "+ find); 
	}

}
