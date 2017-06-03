package IOExceptionAndFileNotFound;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ProblemRised {

	public static void main(String[] args)
	{
		    FileInputStream fis = null;
	        fis = new FileInputStream("C:/myfile.txt"); 
	        
		    int k; 
		while(( k = fis.read() ) != -1) 
		{ 
			System.out.print((char)k); 
		} 

		fis.close(); 

	}

}
