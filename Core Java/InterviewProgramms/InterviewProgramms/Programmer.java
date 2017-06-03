package InterviewProgramms;

import java.util.Scanner;

public class Programmer
{
	public static void main(String[] args)
	{
		int array[]={10,20,30,40,50,60,70,80,90,100};
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
        int a=scan.nextInt();
        int index=-1;
        for(int j=0;j<array.length;j++)
 	    {
        	
        	if(array[j]==a)
        	{
 		       index=j;
        	}	
 	    }
        if(index>=0)
        	System.out.println("element found in array at "+index);
        else
        	System.out.println("element not found in array ");
        	 
        
	}

}
