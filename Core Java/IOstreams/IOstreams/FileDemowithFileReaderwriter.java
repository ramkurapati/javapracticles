package IOstreams;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileDemowithFileReaderwriter {

	public static void main(String args[])throws IOException
	{
		File file = new File("Hello1.txt");
		// creates the file 
		file.createNewFile();
		// creates a FileWriter Object 
		FileWriter writer = new FileWriter(file);
		// Writes the content to the file
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		System.out.println("Enter text");
		writer.write(s.nextLine());
		writer.write("\nThis\n is\n an\n example\n");
		writer.flush(); 
		writer.close();
		//Creates a FileReader Object 
		FileReader fr = new FileReader(file);
		char [] a = new char[50];
		fr.read(a);
		// reads the content to the array
		for(char c : a) 
			System.out.print(c);
		//prints the characters one by one 
		fr.close();
		
		File file2 = new File("Hello2.txt");
		FileReader fr2 = new FileReader(file2);
		char [] b = new char[50];
		fr2.read(b);
		// reads the content to the array
		for(char c : b) 
			System.out.print(c);
		//prints the characters one by one 
		fr2.close();
		File file3 = new File("Hello3.txt");
		FileWriter writer2 = new FileWriter(file3);
		writer2.write(b);
		writer2.flush(); 
		writer2.close();
		}
	}
	
	

