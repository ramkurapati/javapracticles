package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatches

{

	public static void main(String[] args) 
	{

		String line ="This order was places for QT3000! OK?"; 
		String pattern ="(.*)(\\d+)(.*)";
		// Create a Pattern object
		Pattern p =Pattern.compile(pattern);
		// Now create matcher object
		Matcher m = p.matcher(line);
		if(m.find())
		{
			System.out.println("Found value: "+ m.group(0));
			System.out.println("Found value: "+ m.group(1));
			System.out.println("Found value: "+ m.group(2));
			System.out.println("Found value: "+ m.group());
			System.out.println(" ");
		}
		else
		{
			System.out.println("NO MATCH");
		}
		
		String line2 ="rammohan.kurapati@gmail.com"; 
		String pattern2 ="(.*)(@*)(.*)";
		// Create a Pattern object
		Pattern p2 =Pattern.compile(pattern);
		// Now create matcher object
		Matcher m2 = p2.matcher(line);
		if(m.find())
		{
			System.out.println("Found value: "+ m2.group(0));
			System.out.println("Found value: "+ m2.group(1));
			System.out.println("Found value: "+ m2.group(2));
			System.out.println("Found value: "+ m2.group());
			System.out.println(" ");
		}
		else
		{
			System.out.println("NO MATCH");
		}
		
		final String REGEX ="\\bcat\\b"; 
		final String INPUT ="cat cat cat cattie cat";
		
		Pattern p3 =Pattern.compile(REGEX); 
		Matcher m3 = p3.matcher(INPUT);
		
		System.out.println("lookingAt(): "+m3.lookingAt());
		System.out.println("matches(): "+m3.matches());
		// get a matcher object
		int count =0;
		while(m3.find())
		{
			count++;
			System.out.println("Match number "+count);
			System.out.println("start(): "+m2.start());
			System.out.println("end(): "+m2.end());
		}
	}

}
