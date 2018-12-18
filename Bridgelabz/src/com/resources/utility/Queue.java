package com.resources.utility;

import java.util.Scanner;

/**
 * Class for queue implementation
 * @author honey
 *
 */
public class Queue 
{
  static Scanner sc = new Scanner(System.in);
  Object q[];
  int front,rear,capacity;
  
  /**
   * Queue constructor to initialize instance members
   * @param capacity
   */
  public Queue(int capacity)
  {
	  this.capacity = capacity;
	  front = rear = -1;
	  q = new Object[capacity];
  }
  
  /**
   * Method to add element to the queue
   * @param item
   * @return
   */
  public boolean enque(Object item)
  {   
	  //Ensure that element is added when Queue has vacant space
	  if(front == capacity-1)
	  {
		  System.out.println("Queue oveflowed");
		  return false;
	  }
	  
	  if(front == -1)
	  {
		  front++;
	  }
	  
	  q[++rear] = item;
	  return true;
  }
  
  /**
   * Method to remove element from queue
   * @return
   */
  public Object deque()
  {  
	  //Ensure whether queue is underflowed or not
	  if(front == -1)
	  {
		  System.out.println("Queue Underflowed");
		  return null;
	  }
	  Object ob = q[front++];
	  
	  //Front should always be lesser than rear
	  if(front>rear)
	  {
		  front = rear = -1;
	  }
	  
	  return ob;
  }
  
  /**
   * Overloaded toString() to elements of queue
   */
   public String toString()
   {
	   String st = "[";
	   
	   //Loop to grab every element and print it
	   for(int i=front ; i<=rear ; i++)
	   {
		   st = st + q[i];
		   if(i<rear)
		   {
			   st = st + ",";
		   }
	   }
	   return st + "]";
   }

   /**
    * Method to calculate present counter status for cash perspective
    * and ensure cash is balanced or not
    * @param customers
    * @return
    */
public static boolean maintainCash(int customers)
{
	Queue q = new Queue(customers);
	int cash = 0,amount=0;
	

	while(customers > 0)
	{  
		System.out.println("Press D for Deposit and W for withdrawal");
		if(sc.next().charAt(0) == 'D')
		{
			System.out.println("Enter a amount to deposit: ");
			amount = sc.nextInt();
			q.enque(amount);
			cash = cash + amount;
			
		}
		else
			//if(sc.next().charAt(0) == 'W')
			{
				System.out.println("Enter a amount to Withdraw: ");
				amount = sc.nextInt();
				q.enque(amount);
				cash = cash - amount;
				
			}
		customers--;
		q.deque();
	}
	if(cash < 0)
	{
		System.out.println("Cash Underflowed by "+cash +" Rupees");
	}
	
	if(cash > 0)
	{
		System.out.println("Cash Overflowed by "+cash +" Rupees");
	}
	
	if(cash == 0)
	{
		System.out.println("No cash Available");
		return true;
	}
	return false;
}
  
  
  
  
  
}
