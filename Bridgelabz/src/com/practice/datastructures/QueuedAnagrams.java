package com.practice.datastructures;

import com.resources.utility.QueuedLinkedList;
import com.resources.utility.Utility;

public class QueuedAnagrams 
{

	public static void main(String[] args)
	{
		QueuedLinkedList q = new QueuedLinkedList();
		int[] num = Utility.findAnaPrime(1,100);
	     
		 for(int i=0 ; i< num.length ; i++)
		 {   
			 if(num[i] != 0)
			 q.enque(num[i]);
		 }
	        // print Stack elements 
	        q.display(); 
	  
	}

}
