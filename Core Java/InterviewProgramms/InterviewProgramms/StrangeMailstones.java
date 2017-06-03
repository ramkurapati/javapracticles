package InterviewProgramms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class StrangeMailstones {

	public static void main(String[] args) throws IOException
	{
		Set<Integer> set=new HashSet<>();
		//System.out.println("Enter a number");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    //int n=br.read();
		int n=100;
	    for(int i=0;i<=9;i++)
	    {
	    	set.add(i);
	    }
	    System.out.println(set);
	    for(int i=10;i<=n;i++)
	    {
	    	 int reverse=0;
	    	 int index=i;
	   	    while(index!=0)
	   	     {
	   		  reverse=reverse*10;
	   		  int n1=index%10;
	   		  reverse=reverse+n1;
	   		  index=index/10;
	   	     }
	   	    if(i==reverse)
	   	     set.add(i);
	     }
	    System.out.println(set);
	    List<Integer> list=new ArrayList<>();
	    list.addAll(set);
	    Collections.sort(list);
	    System.out.println(list);
	    System.out.println("Enter at which KM ur staying ");
	    int d=br.read();
	    System.out.println("next board");
	    Scanner scan=new Scanner(System.in);
	    int nb=scan.nextInt();
	    for(int i=0;i<=17;i++)
	    { 
	    	for(int j=i+1;j<=18;j++)
	    	{
	    	if(d<=list.indexOf(i) || d>=list.indexOf(j))
	    	{
	    		System.out.println(list.indexOf(j+nb));
	    		
	    	}
	    	break;
	    	}
	    	break;
	    }
	    
	    
	}

}
