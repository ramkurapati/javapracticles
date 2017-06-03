package Loops;


import java.util.Scanner;

public class ForLoopAPPforLargestSequence
{
public static void  main(String[] args)
{
	
	
	
	Scanner s=new Scanner(System.in);
	System.out.println("Enter array length of numbers");
	int x=s.nextInt();
	 int[] a=new int[x];
	System.out.println("Enter array of numbers");
	for(int l=0;l<x;l++)
	{
	a[l]=s.nextInt();
	}
	System.out.println("Enter number you want for lagestsequence");
	int number=s.nextInt();
	for(int i=0;i<x;i++)
	 {
		for(int j=i+1;j<x;j++)
		{
		   for(int k=j+1;k<x;k++)
			 if(a[i]+a[j]+a[k]==number)
			  {
				System.out.println("sequence length 3"  +"("+a[i]+","+a[j]+","+a[k]+")");
				
		      }
	      }
      }
  }
}
