package com.resources.utility;

public class LinkedList
{
  class Node
  {
	   Object data;
	   Node next;
  
	Node(Object data)
	{
		this.data = data;
	}
  }
  static Node head;
   
   public boolean add(Object item)
   {
	   Node n = new Node(item);
	   
	   if(head == null)
	   {
		   head = n ;
		   return true;
	   }
	   Node t = head;
	   while(t.next!=null)
	   {
		   t = t.next;
	   }
	   t.next = n;
	   return true;
	   
   }
   
   public boolean delete(Object item)
   {
	   Node t  = head;
	   Node t1 = head;
	   
	   while(t!= null)
	   {
		   if(t.data.equals(item))
		   {
			   break;
		   }
		   t1 = t;
		   t = t.next;
	   }
	   t1.next = t.next;
	   return true;
   }
   
   public void traverse()
   {
	   Node t = head;
	   
	   while(t != null)
	   {
		   System.out.print(t.data);
		   if(t.next!=null)
		   {
			   System.out.print("->");
		   }
		   t = t.next;
	   }
	   System.out.println(" ");
   }
   
   public  void display()
   {
        Node temp =head;
        while( temp != null)
        {
            System.out.print(temp.data+"---->");
            temp=temp.next;
        }
        System.out.println(" ");
}
   
   public boolean search(Object item)
   {
	   Node t = head;
	   
	   while(t != null)
	   {
		   if(t.data.equals(item) == true)
		   {
			   return true;
		   }
		   t = t.next;
	   }
	   return false;
   }
   
   
  
   
   
   
   
   
   
   
   
}
