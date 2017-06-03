package basic;

import static basic.MyStaticMembClass.*;

public class MyStaticImportDemo
{

	 public static void main(String a[])
	 {
	        System.out.println("Increment value: "+INCREMENT);
	        int count = 10;
	        System.out.println("Increment count: "+incrementNumber(count));
	        int count2 = incrementNumber(count);
	        System.out.println("Increment count: "+incrementNumber(count2));
	  }
	
}
