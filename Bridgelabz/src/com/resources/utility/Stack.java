package com.resources.utility;

public class Stack
{
	Object[] stack;
	int capacity,top = -1;
	
	public Stack(int capacity)
	{
		this.capacity = capacity;
		stack = new Object[capacity]; 
	}
  
	public boolean push(Object item)
	{
		if(top == capacity - 1)
		{
			System.out.println("Stack Overflowed ");
			return false;
		}
		
		stack[++top] = item;
		return true;
	}
	
	public Object pop()
	{
		if(top == -1)
		{
			System.out.println("Stack Underflowed ");
			return null;
		}
		
		return stack[top--];
	}
	
	public void peek()
	{
		if(top == -1)
		{
			System.out.println("No Element present");
		}
		
		System.out.println("Element at Top: "+ stack[top]);
	}
	
	public String toString()
	{
		String st = "[";
		
		for(int i =0 ; i<= top ; i++)
		{
			st = st + stack[i];
			if(i<top)
			{
			  st = st + ",";
		    }
		}
		
		return st + "]";
	}
    
   public int size()
   {
	   return top+1;
   }
   
   public int search(Object item)
   {
	   for(int i=0 ; i< top ; i++)
	   {
	     if(stack[i] == item)
	     {
	    	 return top-i+1;
	     }
	   }
	   
	   return 0;
   }
   
   public boolean isEmpty()  
   { 
       return (top == -1) ? true : false; 
   } 

public static boolean checkBalanced(String st) 
{
	char[] ch = st.toCharArray();
	

	Stack stk = new Stack(8);

	
	for(int i=0 ; i < ch.length ; i++)
	{
		if(ch[i] == '[' || ch[i] == '{' || ch[i] == '(' )
		{
		  stk.push(ch[i]);
		}
		else
		{
			switch(ch[i])
			{
			case ')': if(stk.pop() != (Character)'(')
				      return false;
			          break; 
			          
			case '}': if(stk.pop() != (Character)'{')
			          return false;
		              break; 
		              
			case ']': if(stk.pop() != (Character)'[')
			          return false;
		          
			
			}
		}
	}
	return stk.isEmpty();
}

   
   
   
   
   
   
   
   
   
   
   
   
}
