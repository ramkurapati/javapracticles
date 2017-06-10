package CommandPattern;

public class CreateFileCommand implements Command {

	private FileSystemReceiver fileSystem;
	
	public CreateFileCommand(FileSystemReceiver fs){
		this.fileSystem=fs;
	}
	@Override
	public void execute() {
		//open command is forwarding request to openFile method
		this.fileSystem.createFile();
	}

}
