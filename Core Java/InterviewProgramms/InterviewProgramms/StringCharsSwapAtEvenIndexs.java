package InterviewProgramms;

import java.util.Scanner;

public class StringCharsSwapAtEvenIndexs
{

	
	public static void main(String[] args)
	{
		
		System.out.println("enter sequence of characters ");
		Scanner scan=new Scanner(System.in);
		String givenString=scan.next();
		char[] chararry=givenString.toCharArray();
		int n=chararry.length-1;
		//System.out.println(chararry);
		int last=0;
		for(int i=0;i<=n;i++)
		{
				last=n-i;
		
			if(i%2!=0)
			{
	
			    chararry[i]=chararry[last];
			    
			    chararry[last]= chararry[i];
			   
			}
			
		}
		System.out.println(chararry);
	}

}
