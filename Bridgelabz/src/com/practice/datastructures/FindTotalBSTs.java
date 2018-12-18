package com.practice.datastructures;

import com.resources.utility.BinarySearchTree;
import com.resources.utility.Utility;

public class FindTotalBSTs 
{
		public static void main (String[] args) 
		{ 
		    System.out.println("Enter the number of BSTs you  want: ");
		    int bst = Utility.getInt();
		    
		    while(bst-- > 0)
		    {
		    System.out.println("Enter number of nodes you want in the BST");
		    int n = Utility.getInt();
		  
		    // find count of BST and binary trees with n odes 
		    long count;
		    count = BinarySearchTree.countBST(n); 
		    
		  
		    // print count of BST and  binary trees with n nodes 
		    System.out.println("Total number of BSTs with "+ n +" nodes is "+  count); 
		    }
		    System.out.println();
		} 
	}	

