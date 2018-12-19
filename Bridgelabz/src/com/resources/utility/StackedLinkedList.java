package com.resources.utility;

public class StackedLinkedList 
{
  class Node
  {
	  int data;
	  Node next;
  }
  
  Node top;
  
   public StackedLinkedList()
   {
	  this.top = null;
   }
   
   public void push(int item)
   {
	   Node temp = new Node();
	  
	   temp.data = item;
	   
	   temp.next = top;
	   top = temp;
   }
   
   public void pop()
   {
	   if(top == null)
	   {
	     System.out.println("Stack underflowed");
	     return;
	   }
	   
	   top = top.next;
   }
   
   public boolean isEmpty() 
   { 
       return top == null; 
   } 
 
   // Utility function to return top element in a stack 
   public int peek() 
   { 
       // check for empty stack 
       if (!isEmpty()) { 
           return top.data; 
       } 
       else { 
           System.out.println("Stack is empty"); 
           return -1; 
       } 
   } 
   
   public void display() 
   { 
       // check for stack underflow 
       if (top == null) { 
           System.out.printf("\nStack Underflow"); 
           return;
       } 
       else { 
           Node temp = top; 
           while (temp != null) { 
                
        	   System.out.print(temp.data);
    		   if(temp.next!=null)
    		   {
    			   System.out.print("->");
    		   }              
               temp = temp.next; 
           } 
       } 
   } 
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
}
