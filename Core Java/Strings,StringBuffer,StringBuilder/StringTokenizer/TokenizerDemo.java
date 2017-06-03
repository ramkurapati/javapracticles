package StringTokenizer;

import java.util.StringTokenizer;

public class TokenizerDemo {

	public static void main(String[] args) 
	{
	   
		String mail="rammohan.kurapati@gmail.com";
		
		StringTokenizer st1=new StringTokenizer(mail,".");
		System.out.println(st1.countTokens());
		StringTokenizer st2=new StringTokenizer(mail,"@");
		System.out.println(st2.countTokens());
		while(st1.hasMoreTokens())
		{
			System.out.println(st1.nextToken());
		}
		
		while(st2.hasMoreTokens())
		{
			System.out.println(st2.nextToken());
		}
		
		

	}

}
