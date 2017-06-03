package Strings;

import java.util.ArrayList;
import java.util.List;

public class StringsMethods {
    public static void main(String[] args)
    {
    	String name=new String("K");
		String name1=name.concat("Rammohan");
		System.out.println(name1);

        String surprise="TranspoRTatioN";
        System.out.println(surprise.toLowerCase());
        System.out.println(surprise.toUpperCase());
        
        String jerry="       Hello World       ";
        System.out.println(jerry.trim());
        
        String phrase="I love to program";
        System.out.println(phrase.substring(2,8));// from 2nd to 8th location in between characters
        System.out.println(phrase.substring(3));// from 3rd location to till end
        System.out.println(phrase.replace("love", "want"));// "love'' replaced with "want" 
       
        String s1="this is a book";String s2="a" ; char arr[]=new char[24];
        System.out.println(s1.indexOf(s2));
        System.out.println(s1.lastIndexOf(s2));
        System.out.println(s1.length());
        System.out.println(s1.charAt(5));
       // System.out.println(getChars(1,5,arr[10],4));
        
        String big="BOX"; String small="box";
        System.out.println(big.compareTo(small));
        System.out.println(big.compareToIgnoreCase(small));
         String[] x=s1.split(" ");
        for(String o:x)
        {
        	System.out.println(o);
        }
        String[] y=s1.split(" ",2);//how many u parts u want
        for(String o:y)
        {
        	System.out.println(o);
        }
        
            
    }

	private static char[] getChars(int i, int j, char c, int k) {
		// TODO Auto-generated method stub
		return null;
	}
}
