package randoms;

import java.io.*;

public class FilePractice {

	public static void main(String[] args) throws IOException
	{
		File yourFile = new File("sometext.txt");
		yourFile.createNewFile();
		
		FileInputStream f = new FileInputStream("./sometext.txt");
		
		String st = "";
		int i=0;
		do {
		i = f.read();
		if(i!=-1)
		{
			st = st + (char)i;
		}
		}while(i!=-1);
		
		System.out.println("File Content: "+st);
		
		
	}

}
