package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMethodsDemo {

	
	public static void main(String[] args) 
	{
		String REGEX ="animals"; 
		String INPUT ="animals does not talk. "+"All animals have four legs.";
		String REPLACE ="cats";
		
		Pattern p =Pattern.compile(REGEX); 
		// get a matcher object 
		Matcher m = p.matcher(INPUT);
		String INPUT1=m.replaceFirst(REPLACE);
		String INPUT2 = m.replaceAll(REPLACE);
		System.out.println(INPUT);
		System.out.println(INPUT1);
		System.out.println(INPUT2);
		
		System.out.println("----------------------------");
		
		
		 String REGEX2 ="a*b";
		 String input ="aabfooaabfooabfoob";
		 String REPLACE2 ="-"; 
		 Pattern p2 =Pattern.compile(REGEX2); 
		 // get a matcher object 
		 Matcher m2 = p2.matcher(input);
		 StringBuffer sb =new StringBuffer(); 
		 while(m2.find())
		 {
			 m2.appendReplacement(sb,REPLACE2);
	      }
		 m2.appendTail(sb); 
		 System.out.println(sb);
	
	}

}
