package com.practice.functions;


class CommandLinePower   
{
	 public static void main(String[] args)
	 {
	    
       int n = Integer.parseInt(args[0]);
    
       int i = 0;              
       int powerOfTwo = 1;       

       // repeat until i equals n
       while (i <= n)
       {
        System.out.println(i + " " + powerOfTwo);   // print out the power of two
        powerOfTwo = 2 * powerOfTwo;                // double to get the next one
        i = i + 1;
       }
	 }
}	 