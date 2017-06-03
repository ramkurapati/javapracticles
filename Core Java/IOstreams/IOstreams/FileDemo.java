package IOstreams;

import java.io.File;

public class FileDemo {
	public static void main(String[] args) {
		
	
		String[] strs = {"test1.txt", "test2.txt","test3.txt","D:/ramWS3/corejava/test4.txt"};
		try
		{
			// for each string in string array 
			for(String s:strs )
			{
				// create new
				File f= new File(s); 
				// true if the file is executable
				boolean bool1=f.createNewFile();
				boolean bool = f.canExecute();
				boolean bool2=f.isHidden();
				boolean bool3=f.isFile();
				boolean bool4=f.mkdir();
				//boolean bool5=f.;
				// find the absolute path 
				String a = f.getAbsolutePath(); 
				// prints absolute path 
				System.out.print(a);
				// prints
				System.out.println(" is executable: "+ bool);
				System.out.println(" is executable: "+ bool2);
				System.out.println(" is executable: "+ bool3);
				System.out.println(" is executable: "+ bool4);
				}
			}catch(Exception e)
			{
				// if any I/O error occurs
				e.printStackTrace();
				}
		}

	}

