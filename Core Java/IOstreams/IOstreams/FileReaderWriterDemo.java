package IOstreams;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterDemo {

	public static void main(String args[]) throws IOException 
	{
		FileReader in = null;
		FileWriter out = null; 
		
			in = new FileReader("D:/input2.txt");
			out = new FileWriter("D:/output2.txt");
			int c;
			while ((c = in.read()) != -1)
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
