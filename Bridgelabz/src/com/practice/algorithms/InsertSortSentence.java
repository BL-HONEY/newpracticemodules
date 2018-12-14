package com.practice.algorithms;

import com.resources.utility.Utility;

public class InsertSortSentence
{

	public static void main(String[] args)
	{
		System.out.println("Enter a sentence you whose words you want to sort: ");
		String line = Utility.getStringAsLine();
        
		String[] words = Utility.createStringArray(line);
		
		Utility.insertSortSentence(words);
	}

}
