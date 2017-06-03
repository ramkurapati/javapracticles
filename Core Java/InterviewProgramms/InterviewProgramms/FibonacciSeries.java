package InterviewProgramms;

import java.util.Scanner;

public class FibonacciSeries 
{

	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number upto u want fibonacci series contain how many numbers ");
		int n=scan.nextInt();
		int prev, next, sum;
		prev=0;next=1;
		for(int i=1;i<=n;i++)
		{
		System.out.println(prev);
		sum=prev+next;
		prev=next;
		next=sum;
		}
     
        
	}

}
