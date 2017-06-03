package InterviewProgramms;

import java.util.Scanner;

public class PrimeCheck {

	public static void main(String[] args) 
	{
	
		int n, i, res;
		boolean flag=true;
		@SuppressWarnings("resource")
		Scanner scan= new Scanner(System.in);
		System.out.println("Please Enter a No.");
		n=scan.nextInt();
		for(i=2;i<=n/2;i++)
		{
			System.out.println(" n/2 "+(n/2));
			res=n%i;
			System.out.println(res);
			if(res==0)
			{
				flag=false;
				break;
			}
		}
		if(flag)
			System.out.println(n + " is Prime Number");
		else
			System.out.println(n + " is not Prime Number");

	}

}
