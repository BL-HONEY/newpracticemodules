package com.resources.utility;

/**
 * Class to add elements of queue to the linked list 
 * @author honey
 *
 */
public class Qnode 
{
   int key;
   Qnode next;
   
   public Qnode(int key)
   {
	   this.key  = key;
	   this.next = null;
   }
}
