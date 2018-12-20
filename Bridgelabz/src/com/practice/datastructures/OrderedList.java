package com.practice.datastructures;

import java.io.IOException;

import com.resources.utility.Files;
import com.resources.utility.LinkedList;
import com.resources.utility.Utility;

public class OrderedList 
{
	public static void main(String[] args) throws IOException
    {
	  String path = "somenumbers.txt";
	  String[] st =  Files.readFile(path);
	 
	  System.out.print("File Content: ");
      for(int i = 0 ; i < st.length ; i++)
   	  {
   	    System.out.print(st[i]+" "); 
   	  }
      System.out.println();
      int[] nums = Utility.stringToNumArray(st);
//      
//      System.out.print("Sorted ");
//    //  int[] sortedNums = Utility.insertionSort(nums);
//      
//    //  String[] sortedNums = Utility.insertSortSentence(st);
//      
     LinkedList l = new LinkedList();	  
//	 
	  for(int i = 0 ; i < st.length ; i++)
	 {
		 l.add(nums[i]);
	 }
//	  
	  System.out.print("Present linked list: ");
	  l.traverse();
	  
	  l.sort();
	  
	  l.traverse();
	  
	}

}
