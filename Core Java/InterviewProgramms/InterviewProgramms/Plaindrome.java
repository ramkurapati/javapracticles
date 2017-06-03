package InterviewProgramms;

import java.util.Scanner;

public class Plaindrome 
{

	public static void main(String[] args)
	{
		Scanner scan =new Scanner(System.in);            
		System.out.println("enter a binary number");
		int num=scan.nextInt();
		int n=num;
		int rev = 0;
		int dig;
		 while (num > 0)
		 {
		      dig = num % 10;
		      System.out.println("dig "+dig);
		      rev = rev * 10 + dig;
		      System.out.println("reverse "+rev);
		      num = num / 10;
		      System.out.println("num "+num);
		      
		 }
		if(n==rev)
		{
			System.out.println("given number is palindrome");
		}
		else
			System.out.println("given number is not palindrome");
	}

}
