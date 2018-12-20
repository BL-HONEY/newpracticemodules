package com.practice.client;

import java.io.IOException;

import com.practice.util.Files;

public class Random {

	public static void main(String[] args) throws IOException 
	{  
		String path = "textstring.txt";
		String[] st = Files.readFile(path);
		
		for(int i = 0 ; i< st.length ; i++)
		{
			System.out.println(st[i]);
		}

	}

}
