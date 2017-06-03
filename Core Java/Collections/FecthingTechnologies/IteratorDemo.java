package FecthingTechnologies;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class IteratorDemo {
	public static void main(String args[]) {
	      
	      Vector<String> dayNames = new Vector<String>();
	      dayNames.add("Sunday");
	      dayNames.add("Monday");
	      dayNames.add("Tuesday");
	      dayNames.add("Wednesday");
	      dayNames.add("Thursday");
	      dayNames.add("Friday");
	      dayNames.add("Saturday");
	      
	      System.out.println(dayNames);
	      
	      Iterator<String> it = dayNames.iterator();
	  
	      @SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		     System.out.println("Enter element to remove");
		     String element=scan.next();
		  while (it.hasNext())
		   {
		    	 String str=(String)it.next();
		         if(str.equals(element)) 
		         {
		        	 it.remove();
		        	 
		         }
		    }
		  System.out.println(dayNames);   
	   }
}
