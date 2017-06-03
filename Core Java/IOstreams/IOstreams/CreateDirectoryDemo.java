package IOstreams;

import java.io.File;

public class CreateDirectoryDemo {

	public static void main(String args[])
	{ 
		String[] paths;
		String dirname = "D:tmp/user/java/bin/";
		File f = new File(dirname);
		// Create directory now.
		f.mkdirs();
		paths = f.list();
		for(String path:paths)
		  { 
			// prints filename and directory name 
			System.out.println(path);
			}
		System.out.println("Directory exist  "+f.exists());
		System.out.println("Directory exist  "+f);
		System.out.println("Directory exist  "+f.isDirectory());
		System.out.println("Directory exist  "+f.isFile());
		System.out.println("Directory exist  "+f.list());
	}
	
		
		
}


