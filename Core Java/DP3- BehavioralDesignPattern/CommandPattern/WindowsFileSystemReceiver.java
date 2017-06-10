package CommandPattern;

import java.io.File;
import java.io.IOException;

public class WindowsFileSystemReceiver implements FileSystemReceiver {

	@Override
	public void createFile() {
		System.out.println("creating file in Windows OS");
		
		File file=new File("D:\\OOOWork\\JavaGitHubworkspace\\testfiles\\newfile.txt");
		try {
			if(file.createNewFile()){
				System.out.println("File is created!");
			}else{
				System.out.println("File already exists.");
			
			}
		} catch (IOException e) {
			e.printStackTrace();
		}	
			
		
	}

	@Override
	public void writeFile() {
		System.out.println("Writing file in Windows OS");
	}

	@Override
	public void deleteFile() {
		System.out.println("Deleting file in Windows OS");
	}

}
