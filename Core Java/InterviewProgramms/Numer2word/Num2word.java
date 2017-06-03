package Numer2word;

import java.util.Scanner;


public class Num2word
{
	String word[]={" zero "," one"," two"," three"," four"," five"," six"," seven"," eight"," Nine"};
	public void method1(int i)
	{
		System.out.print(word[i%10]);
	}
	public void method2(int i)
	{
		System.out.print(word[i/10]+word[i%10]);
	}
	public void method3(int i)
	{
		System.out.print(word[i/100]);
	}
	public void method4(int i)
	{
		System.out.print(word[i/1000]);
	}
	public void method5(int i)
	{
		System.out.print(word[i/10000]);
	}
	public void method6(int i)
	{
		System.out.print(word[i/100000]);
	}
	public static void main(String[] args)
	{
		Num2word nw=new Num2word();
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter a number");
		int i=scanner.nextInt();
		if(i<10)
			nw.method1(i);
		  else
			if(i<100)
				nw.method2(i);
			 else
					if(i<1000)
					{
						nw.method3(i);
						i=i%100;
						nw.method2(i);
					}
					else 
					  if(i<10000)
					  {
						    nw.method4(i);
							i=i%1000;
							nw.method3(i);
							i=i%100;
							nw.method2(i);	
					  }
					  else 
						  if(i<100000)
						  {
							    nw.method5(i);
							    i=i%10000;
							    nw.method4(i);
								i=i%1000;
								nw.method3(i);
								i=i%100;
								nw.method2(i);	
						  }
						  else 
							  if(i<1000000)
							  {
								  nw.method6(i);
								    i=i%100000;
								    nw.method5(i);
								    i=i%10000;
								    nw.method4(i);
									i=i%1000;
									nw.method3(i);
									i=i%100;
									nw.method2(i);	
							  }
	}
	
}
