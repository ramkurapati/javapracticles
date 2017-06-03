package InterviewProgramms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ReverseNumber {

	
	public static void main(String[] args) throws IOException 
	{
		System.out.println("Enter a number");
		Scanner scan=new Scanner(System.in);
	  int n=scan.nextInt();
	  int reverse=0;
	  while(n!=0)
	  {
		  reverse=reverse*10;
		  int n1=n%10;
		  reverse=reverse+n1;
		  n=n/10;
		  
		  
	  }
	  /*if(n==reverse)
	     System.out.println("given number palindrome");
	  else
		  System.out.println("not palindrome");*/
	  System.out.println(reverse);
	}

}
