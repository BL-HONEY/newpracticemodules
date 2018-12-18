package com.resources.utility;

public class Deque
{
  static Object[] dq;
  static int front , rear, capacity;
  
  public Deque(int capacity)
  {   
	  dq = new Object[capacity];
	  this.capacity = capacity;
	  front = -1;
	  rear = 0;
  }
  public boolean isEmpty()
  {
	  if(front == -1)
	  {
		  return true;
	  }
	  return false;
  }
  
  public boolean isFull()
  {
	  if(front == 0 &&rear == capacity-1 || front == rear + 1)
	  {
		  return true;
	  }
	  return false;
  }
  
  /**
   * Method to add element at front of deque
   * @param item
   */
  public void insertfront(Object item)
  {
      // check whether deque if  full or not 
	  if(isFull())
	  {
          System.out.println("Queue Overflowed");  
		  return;
	  }
	  
      // If queue is initially empty 
	  if(isEmpty())
	  {
		  front = 0;
		  rear = 0;
	  }
	  
	  // front is at first position of queue 
      else if (front == 0) 
      {
          front = capacity - 1 ;
      }
      else
      {
    	front = front - 1;  
      }
	  
	  dq[front] = item;
  }
  
  /**
   * Method to add an element at rear
   * @param item
   */
  public void insertrear(Object item)
  {
	// check whether deque if  full or not 
		  if(isFull())
		  {
	          System.out.println("Queue Overflowed");  
			  return;
		  }
		  
	      // If queue is initially empty 
		  if(isEmpty())
		  {
			  front = 0;
			  rear = 0;
		  }
		  
		  else if(rear == capacity - 1)
		  {
			  rear = 0;
		  }
		  else
		  {
			  rear = rear + 1;
		  }
		  
		  dq[rear] = item;
  }
   /**
    * Method to delete element from front
    */
   public void deletefront()
   {
	// check whether Deque is empty or not 
       if (isEmpty()) 
       { 
           System.out.println("Queue Underflowed");  
       } 
  
       // Deque has only one element 
       if (front == rear) 
       { 
           front = -1; 
           rear = -1; 
       } 
       else
           // back to initial position 
           if (front == capacity -1)
           {
               front = 0; 
           }
           else 
           {
        	   // increment front by '1' to remove current 
        	    // front value from Deque 
               front = front+1; 
           }
            
   }
     /**
      * Method to delete rear element
      */
     public void deleterear()
     {
    	// check whether Deque is empty or not 
         if (isEmpty()) 
         { 
             System.out.println("Queue Underflowed");  
         } 
    
         // Deque has only one element 
         if (front == rear) 
         { 
             front = -1; 
             rear = -1; 
         }  
         else if (rear == 0) 
             rear = capacity-1; 
         else
             rear = rear-1; 
     }
  
     /**
      *Method which Returns front element of Deque 
      * @return
      */
     public Object getFront() 
     { 
         // check whether Deque is empty or not 
         if (isEmpty()) 
         { 
             System.out.println("Queue Underflowed"); 
             return -1 ; 
         } 
         return dq[front]; 
     } 
    
     /**
      * Method return rear element of Deque 
      * @return
      */
     public Object getRear() 
     { 
         // check whether Deque is empty or not 
         if(isEmpty() || rear < 0) 
         { 
             System.out.println("Queue Underflowed"); 
             return -1 ; 
         } 
         return dq[rear]; 
     } 
  
      /**
       * Method to check Palindrome
       * @return
       */
      public static boolean checkPalindrome()
      {
    	  int temp = front;
    	  
    	  //check till values of reat and front are valid
    	  while(rear!=0 && temp != rear)
    	  { 
    		 //check every element present in deque
    	    if(dq[rear--] == dq[temp++])
           {
         	return true; 
           }
    	  }
    	  return false;
      }
  
  
  
  
  
  
  
  
  
}
