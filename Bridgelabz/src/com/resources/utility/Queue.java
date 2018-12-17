package com.resources.utility;

import java.util.Scanner;

public class Queue 
{
	static Scanner sc = new Scanner(System.in);
  Object q[];
  int front,rear,capacity;
  
  public Queue(int capacity)
  {
	  this.capacity = capacity;
	  front = rear = -1;
	  q = new Object[capacity];
  }
  
  public boolean enque(Object item)
  {
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
  
  public Object deque()
  {
	  if(front == -1)
	  {
		  System.out.println("Queue Underflowed");
		  return null;
	  }
	  Object ob = q[front++];
	  
	  if(front>rear)
	  {
		  front = rear = -1;
	  }
	  
	  return ob;
  }
  
   public String toString()
   {
	   String st = "[";
	   
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

public static boolean maintainCash(int customers)
{
	Queue q = new Queue(customers);
	int cash = 0,amount=0;
	while(customers != 0)
	{  
		System.out.println("Press D for Deposit and W for withdrawal");
		if(sc.next().charAt(0) == 'D')
		{
			System.out.println("Enter a amount to deposit: ");
			amount = sc.nextInt();
			q.enque(amount);
			cash = cash + amount;
			q.deque();
		}
		else
			if(sc.next().charAt(0) == 'W')
			{
				System.out.println("Enter a amount to Withdraw: ");
				amount = sc.nextInt();
				q.enque(amount);
				cash = cash - amount;
				q.deque();
			}
	}
	if(cash == 0)
	{
		return true;
	}
	return false;
}
  
  
  
  
  
}
