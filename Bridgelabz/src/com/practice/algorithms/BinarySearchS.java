package com.practice.algorithms;

import com.resources.utility.Utility;

public class BinarySearchS 
{

	public static void main(String[] args)
	{
		System.out.println("Enter a string in which you want to search a word :  ");
		String st = Utility.getStringAsLine();
		
		String[] stArray = Utility.createStringArray(st);
		
		String[] sortedStArray = Utility.insertSortSentence(stArray);
		
		
		System.out.println("Enter a word you want to search in your string: ");
		String word = Utility.getStringAsWord();
		
		int res = Utility.binarySearchS(sortedStArray,0,sortedStArray.length-1,word);
		
		System.out.println("Found at index " + res + ": "+ word); 

	}

}
