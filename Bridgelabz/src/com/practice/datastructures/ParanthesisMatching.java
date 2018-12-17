package com.practice.datastructures;

import com.resources.utility.Stack;
import com.resources.utility.Utility;

public class ParanthesisMatching 
{

	public static void main(String[] args)
	{
		System.out.println("Enter a String to test Parenthesis Balancing: ");
		String st = Utility.getStringAsWord();
		
		
		if(Stack.checkBalanced(st))
		{
			System.out.println("Parenthesis is balanced");
		}
		else
		{
			System.out.println("Parenthesis not balanced");
		}
		

	}

}
