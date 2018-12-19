package com.practice.datastructures;

import com.resources.utility.Utility;

/**
 * Method to 
 * @author honey
 *
 */
public class PrimeAnagrams 
{

	public static void main(String[] args)
	{
		  int[][] anaPrime = new int[9][];

			
		  anaPrime[0] = Utility.findAnaPrime(1,100);
		  
		  anaPrime[1] = Utility.findAnaPrime(100, 200);
		  
		  anaPrime[2] = Utility.findAnaPrime(200, 300);
		  
		  anaPrime[3] = Utility.findAnaPrime(300, 400);
		  
		  anaPrime[4] = Utility.findAnaPrime(400, 500);
		  
		  anaPrime[5] = Utility.findAnaPrime(500, 600);
		  
		  anaPrime[6] = Utility.findAnaPrime(600, 700);
		  
		  anaPrime[7] = Utility.findAnaPrime(800, 900);
		  
		  anaPrime[8] = Utility.findAnaPrime(900, 999);
		  
		  
		  for(int j=0 ; j<anaPrime.length ; j++)
		  {
		     for(int i=0 ; i<anaPrime[j].length ; i++)
		     {
			    if(anaPrime[j][i] != 0)
			   {
				System.out.print(anaPrime[j][i] +" ");
			   }
		     }
		     System.out.println("");
	      }

	}

}
