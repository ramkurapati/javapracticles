package CommandPattern;

public class UnixFileSystemReceiver implements FileSystemReceiver {

	@Override
	public void createFile() {
		System.out.println("Creating file in unix OS");
	}

	@Override
	public void writeFile() {
		System.out.println("Writing file in unix OS");
	}

	@Override
	public void deleteFile() {
		System.out.println("deleting file in unix OS");
	}

}
