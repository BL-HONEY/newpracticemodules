package com.practice.datastructures;

import com.resources.utility.Utility;

public class PrimeRange 
{
	public static void main(String[] args)
	{
	  int[][] prime = new int[9][];
	
	  prime[0] = Utility.findPrime(1, 100);
	  
	  prime[1] = Utility.findPrime(100, 200);
	  
	  prime[2] = Utility.findPrime(200, 300);
	  
	  prime[3] = Utility.findPrime(300, 400);
	  
	  prime[4] = Utility.findPrime(400, 500);
	  
	  prime[5] = Utility.findPrime(500, 600);
	  
	  prime[6] = Utility.findPrime(600, 700);
	  
	  prime[7] = Utility.findPrime(800, 900);
	  
	  prime[8] = Utility.findPrime(900, 999);
	  
	  
	  for(int j=0 ; j<prime.length ; j++)
	  {
	 for(int i=0 ; i<prime[j].length ; i++)
	 {
	System.out.print(prime[j][i] +" ");
	 }
	 System.out.println("");
	  }
	 
	 
	  
	
	 }
	}


