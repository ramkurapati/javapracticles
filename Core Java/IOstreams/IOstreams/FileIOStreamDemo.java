package IOstreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileIOStreamDemo {

	public static void main(String args[]) throws IOException
	{
		  
		
			InputStream in = new FileInputStream("ResultFiles/input.txt");
			OutputStream out = new FileOutputStream("ResultFiles/output.txt");
			int c;
			while ((c = in.read())!= -1)
			 {
				out.write(c);
			 }
		
			if (in != null)
			{
				in.close();
			} 
			if (out != null)
			{ 
				out.close();
			}
		
	}
	
	
	
}
