package FecthingTechnologies;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

public class EnumerationTester {

	
	public static void main(String args[]) {
	       
	      Vector<String> dayNames = new Vector<String>();
	      dayNames.add("Sunday");
	      dayNames.add("Monday");
	      dayNames.add("Tuesday");
	      dayNames.add("Wednesday");
	      dayNames.add("Thursday");
	      dayNames.add("Friday");
	      dayNames.add("Saturday");
	      Enumeration<String> days = dayNames.elements();
	      while (days.hasMoreElements()){
	         System.out.println(days.nextElement()); 
	      }
	      
	      ArrayList<String> al=new ArrayList<String>();
	    		  al.addAll(dayNames);
	   }
}
