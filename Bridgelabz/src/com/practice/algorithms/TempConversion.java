package com.practice.algorithms;

import com.resources.utility.Utility;

public class TempConversion 
{
	public static void main(String[] args) 
	{
      Utility.printInstructions1();
      
      char ch = Utility.getChar();
      System.out.println("Enter a value in "+ ch + " to convert: ");
      int temp = Utility.getInt();
      
       Utility.convertTemp(ch,temp);
	}
}
