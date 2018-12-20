package com.practice.util;

	import java.io.File;
	import java.io.IOException;
	import java.util.Scanner;

	public class Files 
	{
		
		
		public static String[] readFile(String path) throws IOException 
		{    
			
			 File file = new File(path);
			 file.createNewFile();
			 int count=0,i=0;
			 
			 Scanner sc = new Scanner(file);
			 while(sc.hasNext())
			 {
			       sc.next();
			        count++;
		     }
			  sc.close();
			  String[] st=new String[count];
			    
			  Scanner sc2 = new Scanner(file); 
			  while (sc2.hasNext()) 
			  {
		        st[i++] =  sc2.next();
		      }
			return st;   
		}

		

}
