package com.resources.utility;

/**
 * Implement Binary Search Tree
 * @author honey
 *
 */
public class BinarySearchTree
{
  class Node
  {
	  int key;
      Node left , right;
      
      public Node(int key)
      {
    	  this.key = key;
    	  left = null;
    	  right = null;
      }
  }
  
   Node root;
   public BinarySearchTree()
   {
	   root = null;
   }
  
   public Node insertNew(Node root , int key)
   {   
	   //check if root is null
	   if(root == null)
	   {
		   root = new Node(key);
		   return root;
	   }
	   
	   // Otherwise, recur down the tree 
       if (key < root.key) 
           root.left = insertNew(root.left, key); 
       else if (key > root.key) 
           root.right = insertNew(root.right, key); 
 
       // return the (unchanged) node pointer 
       return root; 
   }
   
   public void insert(int key)
   {
	   root = insertNew(root,key);
   }
   
   public void inorder() 
   { 
       inorderRec(root); 
   } 
  
    /**
     *Method to do inorder traversal of BST 
     * @param root
     */
    void inorderRec(Node root) 
    { 
        if (root != null) 
        { 
            inorderRec(root.left); 
            System.out.println(root.key); 
            inorderRec(root.right); 
        } 
    }
    
    static int binomialCoeff(int n, int k) 
    { 
      int res = 1; 

      // Since C(n, k) = C(n, n-k) 
      if (k > n - k)
      {
          k = n - k; 
      }
      
      // Calculate value of  [n*(n-1)*---*(n-k+1)] [k*(k-1)*---*1] 
      for (int i = 0; i < k; ++i) 
      { 
        res *= (n - i); 
        res /= (i + 1); 
      } 

      return res; 
    } 


    /**
     *A Binomial coefficient based method to find nth catalan number  
     * @param n
     * @return
     */
     public static int catalan( int n) 
     {  

       // Calculate value of 2nCn 
       int c = binomialCoeff(2 * n, n); 

      // return 2nCn/(n+1) 
      return c / (n + 1); 
     } 

    /**
     *A function to count number of  BST with n nodes using catalan number
     * @param n
     * @return
     */
     public static int countBST( int n) 
     { 
      // find nth catalan number 
      int count = catalan(n); 

      // return nth catalan number 
      return count; 
     } 


}
