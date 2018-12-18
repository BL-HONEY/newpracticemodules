package com.resources.utility;

import java.util.Scanner;

public class HashFunction 
{  
     
	public static void hashing(String[] st)
	{ 
		 LinkedList[] order = new LinkedList[11];
		 
		 int[] nums = new int[st.length];
		 
		 for(int i=0 ; i< st.length ;i++)
		 {
			 nums[i] = Integer.parseInt(st[i]);
		 }
		 
		 
		 for(int i=0; i<nums.length; i++)
			{
				int rem = nums[i]%11;
				if(order[rem]== null)
				{
					order[rem] = new LinkedList();
					order[rem].add(nums[i]);
				}
				else
				{
					
					order[rem].add(nums[i]);
	            }
	         }       
		    for(int i=0;i<11;i++)
			{
				System.out.println(i);
				if(order[i] !=null)
				{
					order[i].traverse();
				}
			}
		 
//		searchEle(order);
//		
//		for(int i=0;i<11;i++)
//		{
//			System.out.println(i);
//			if(order[i] !=null)
//			{
//				order[i].traverse();
//			}
//		}
		
     }
	
	   
       public static void searchEle(LinkedList[] order)
       {
    	 Scanner scanner = new Scanner(System.in);
   		 System.out.print("Enter a number to search: ");
        int search = scanner.nextInt();
        
        for(int i=0 ; i < order.length ; i++)
        {
        	if(order[i].search(search))
        	{
        		order[i].delete(search);
        	}
        	else
        	{
        		order[i].add(search);
        	}
        }
       }
       
        
        
        
        
	
	
	
	
	
	
	
	
	
} 