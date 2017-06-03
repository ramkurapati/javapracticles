package InterviewProgramms;

public class argsNull {

	
	public static void main(String args[]) 
	{
		args=new String[6];
		args[2]="54";
		System.out.println(args[2]);
		main(8,9,0,7,4,1,5);

	}
	public static void main(Integer... args) 
	{
		//args=new Integer[6];
		//args=null;
		//System.out.println(args[6]);
		System.out.println("in sub main");
		

	}
}
