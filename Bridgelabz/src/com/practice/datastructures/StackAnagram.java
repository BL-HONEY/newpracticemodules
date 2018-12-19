package com.practice.datastructures;

import com.resources.utility.StackedLinkedList;
import com.resources.utility.Utility;

public class StackAnagram
{

	public static void main(String[] args)
	{
		 StackedLinkedList obj = new StackedLinkedList(); 
	        // insert Stack value 
		int[] num = Utility.findAnaPrime(1,100);
	     
		 for(int i=0 ; i< num.length ; i++)
		 {   
			 if(num[i] != 0)
			 obj.push(num[i]);
		 }
	        // print Stack elements 
	        obj.display(); 
	  

	}

}
