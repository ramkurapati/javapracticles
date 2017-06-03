package Strings;


import java.util.StringTokenizer;

public class StringSplitDemo {

	public static void main(String[] args)
	{
		String mail="rammohan.kurapati@gmail.com";
	
		String[] mailsplit=mail.split("@");
		//String name=mail.split("@")[0];
		
		
		StringTokenizer st=new StringTokenizer(mailsplit[0],".");
		StringTokenizer st2=new StringTokenizer(mailsplit[1],".");
		
		
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
		
		System.out.println(st2.nextToken());

	}
}
