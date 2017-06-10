package CommandPattern;

public class FileSystemClient {

	public static void main(String[] args) {
		//Creating the receiver object
				FileSystemReceiver fs = FileSystemReceiverUtil.getUnderlyingFileSystem();
				
				//creating command and associating with receiver
				CreateFileCommand openFileCommand = new CreateFileCommand(fs);
				
				//Creating invoker and associating with Command
				FileInvoker file = new FileInvoker(openFileCommand);
				
				//perform action on invoker object
				file.execute();
				
				WriteFileCommand writeFileCommand = new WriteFileCommand(fs);
				file = new FileInvoker(writeFileCommand);
				file.execute();
				
				DeleteFileCommand closeFileCommand = new DeleteFileCommand(fs);
				file = new FileInvoker(closeFileCommand);
				file.execute();
			}


}
