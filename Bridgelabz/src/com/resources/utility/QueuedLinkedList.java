package com.resources.utility;

public class QueuedLinkedList 
{
	Qnode front , rear;
	
	public QueuedLinkedList()
	{
		this.front = null;
		this.rear = null;
	}
	
	public void enque(int key)
	{
		Qnode temp = new Qnode(key);
		
		if(this.rear == null)
		{
			this.rear = this.front = temp;
			return;
		}
		
		rear.next = temp;
		rear = temp;
	}
	
	public Qnode deque()
	{
		
		if(this.front == null)
		{
			return null;
		}
		
		Qnode temp = front;
		front = front.next;
		
		if (this.front == null) 
		{
			 this.rear = null;
		}
	        return temp; 
	}
	
	public void display()
	{
		Qnode t = front;
		
		while(t!=null)
		{
			System.out.print(t.key);
			if(t.next!=null)
				System.out.print("-->");
			t = t.next;
		}
		System.out.println("");
	}
}
