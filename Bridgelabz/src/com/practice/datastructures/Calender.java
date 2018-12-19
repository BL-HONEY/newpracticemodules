package com.practice.datastructures;

import com.resources.utility.Utility;

/**
 * Print Calender for a particular month and year
 * @author admin1
 *
 */
public class Calender
{
	public static void main(String[] args)
	{
		int month = Integer.parseInt(args[0]);
		int year  = Integer.parseInt(args[1]);
		
		 String[] months = {
		            "",                              
		            "January", "February", "March",
		            "April", "May", "June",
		            "July", "August", "September",
		            "October", "November", "December"
		        };

		        // days[i] = number of days in month i
		        int[] days = {
		            0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
		        };

		        // check for leap year
		        if (month == 2 && Utility.isLeapYear(year)) days[month] = 29;
		        
		        System.out.println("   " + months[month] + " " + year);
		        System.out.println(" S  M Tu  W Th  F  S");

		        // starting day
		        int d = Utility.findDay(month, 1, year);
               
		        // print the calendar
		        for (int i = 0; i < d; i++)
		        {
		            System.out.print("   ");
		        }
		        for (int i = 1; i <= days[month]; i++) 
		        {
		            System.out.printf("%2d ", i);
		            
		            if (((i + d) % 7 == 0) || (i == days[month]))
		            {
		            	System.out.println();
		            }
		        }
       

	}

}
