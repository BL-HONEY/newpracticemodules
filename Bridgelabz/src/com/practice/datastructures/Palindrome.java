package com.practice.datastructures;

import com.resources.utility.Deque;
import com.resources.utility.Utility;

public class Palindrome
{

	public static void main(String[] args) 
	{
		Deque d = new Deque(5);
//		//System.out.println("Enter a string: ");
		String st = Utility.getStringAsWord();
//		d.addRear(5);
//		d.addFront(6);
////		for(int i=0 ; i<st.length();i++)
////		{
////			d.addRear(st.charAt(i));
////		}
//		d.getRear();
//		d.getFront();
		
		for(int i=0 ; i<st.length();i++) 
         d.insertrear(st.charAt(i)); 
             
         System.out.println("get rear element : "+ d.getRear()); 
         System.out.println("get front element : "+ d.getFront()); 
         
         if(Deque.checkPalindrome())
         {
        	 System.out.println("palindrome");
         }
         else
         {
        	 System.out.println("not a palindrome");
         }

	}

}
