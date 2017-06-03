package IOExceptionAndFileNotFound;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ProblemHandledByTryCatch {

	public static void main(String[] args)
	{
		    FileInputStream fis = null;
	        try 
	        {
				fis = new FileInputStream("B:/myfile.txt");
			 } 
	        catch (FileNotFoundException e)
	        {
				
				e.printStackTrace();
			} 
	        
		    int k; 
		  try 
		   {
			while(( k = fis.read() ) != -1) 
			{ 
				System.out.print((char)k); 
			}
			fis.close();
		  } 
		  catch (IOException e) 
		  {
			e.printStackTrace();
    	  } 

		

	}

}
