package UserException;

import java.util.Scanner;

public class CustomExceptionDemo
{

	  static void validate(int age) throws InvalidAgeException
	  {  
	     if(age<18)  
	      throw new InvalidAgeException("not valid age ");  
	     else  
	      System.out.println("welcome to vote");  
	   }  
	
	public static void main(String[] args)
	{
		/*System.out.println("enter u r age");
		Scanner s=new Scanner(System.in);
		int age=s.nextInt();*/
		 try{  
		      validate(12);  
		     }
		 catch(Exception m)
		    {
			 System.out.println("Exception occured: "+m);
			 
			 }  
		
		/*if(age<18)
			try {
				throw new InvalidAgeException("not valid age ");
			} catch (InvalidAgeException e) {
				e.printStackTrace();
			}
		else  
		      System.out.println("welcome to vote"); */
		  
		  System.out.println("rest of the code...");  


	}

}
