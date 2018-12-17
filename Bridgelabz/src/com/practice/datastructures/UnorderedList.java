package com.practice.datastructures;

import java.io.IOException;



import com.resources.utility.Files;
import com.resources.utility.LinkedList;
import com.resources.utility.Utility;

public class UnorderedList
{

	public static void main(String[] args) throws IOException
	{
	 
		String path = "sometext.txt";
      String[] st =  Files.readFile(path);
      
      System.out.print("File Content: ");
      for(int i = 0 ; i < st.length ; i++)
    		 {
    		System.out.print(st[i]+" "); 
    		 }

  
	  LinkedList l = new LinkedList();	  
	  System.out.println();
	  for(int i = 0 ; i < st.length ; i++)
	 {
		 l.add(st[i]);
	 }
	 
	  System.out.print("Present linked list: ");
	  l.traverse();
	  
	  System.out.println("");
	  System.out.println("Enter a word to search: ");
	  
	  String search = Utility.getStringAsWord();
		
	  if(l.search(search))
	  {
		  System.out.println("Item Found");
		  System.out.println("Deleting the item......");
		  l.delete(search);
		  l.traverse();

	  }
	  else
	  { 
		  System.out.println("Not Found");
		  System.out.println("Adding the item......");
		  l.add(search);
		  l.traverse();
	  }
      
	}

}
