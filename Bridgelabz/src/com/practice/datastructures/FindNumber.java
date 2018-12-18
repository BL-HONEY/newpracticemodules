package com.practice.datastructures;

import java.io.IOException;

import com.resources.utility.Files;
import com.resources.utility.HashFunction;

public class FindNumber
{

	public static void main(String[] args) throws IOException
	{
		String path = "somenumbers.txt";
	    String[] st =  Files.readFile(path);
        HashFunction.hashing(st);
	}

}
