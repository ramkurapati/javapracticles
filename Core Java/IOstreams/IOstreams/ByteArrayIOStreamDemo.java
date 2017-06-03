package IOstreams;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteArrayIOStreamDemo {

	public static void main(String args[])throws IOException 
	{
		ByteArrayOutputStream bOutput = new ByteArrayOutputStream(26);
		System.out.println("enter the content ");
		while( bOutput.size()!= 26 )
		{
			// Gets the inputs from the user
			bOutput.write(System.in.read());
		}
		byte b [] = bOutput.toByteArray();
		System.out.println("Print the content");
		for(int x= 0 ; x < b.length; x++) 
		{
			// printing the characters 
			System.out.print((char)b[x] + " ");
		}
		System.out.println(" "); 
		int c;
		ByteArrayInputStream bInput = new ByteArrayInputStream(b);
		System.out.println("Converting characters to Upper case " ); 
		for(int y = 0 ; y < 1; y++ )
		{
			while(( c= bInput.read())!= -1)
			{
				System.out.print(Character.toUpperCase((char)c));
			}
			bInput.reset();
		}
	}
	}

	
