package Strings;

public class StringCreation 
{

	public static void main(String[] args)
	{
		String s1=new String();
		s1="ram";
		
		String s2="ram";
		
		String s3=new String("ram");
		
		String s4=new String(s2);//not preferred because s2 we have to create before
		
		char c[]={'r','a','m'};
		String s5=new String(c);
		
		String s6=new String(c,0,2);//here c means from which array,0 means start from 1st location,2 means number characters
		
		System.out.println("  " +s5);
		System.out.println("  " +s6);
		
	}

}
