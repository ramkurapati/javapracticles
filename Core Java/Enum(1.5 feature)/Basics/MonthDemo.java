package Basics;

import java.util.Scanner;

public class MonthDemo 
{
    public static void main(String[] args)
    {
	   for(Month month:Month.values())
	   {
		 System.out.println(month.getValue()+" "+month);
	   }
	
	   Scanner scan=new Scanner(System.in);
	   System.out.println("Enter month name");
	   Month month =Month.valueOf(scan.next());
	   switch(month)
	   {
	      case January :   System.out.println("U r in "+month.getValue());break;
	      case February:   System.out.println("U r in "+month.getValue());break;
	      case March   :   System.out.println("U r in "+month.getValue());break;
	      case April   :   System.out.println("U r in "+month.getValue());break;
	      case May     :   System.out.println("U r in "+month.getValue());break;
	      case June    :   System.out.println("U r in "+month.getValue());break;
	      case July    :   System.out.println("U r in "+month.getValue());break;
	      case August  :   System.out.println("U r in "+month.getValue());break;
	      case September:  System.out.println("U r in "+month.getValue());break;
	      case October  :  System.out.println("U r in "+month.getValue());break;
	      case November :  System.out.println("U r in "+month.getValue());break;
	      case December :  System.out.println("U r in "+month.getValue());break;
	      
	      default       :  System.out.println("U r enter wrong month ");
	     
	   }
	   System.out.println("Enter month name");
	   Month month2 =Month.valueOf(scan.next());
	   if(month2.equals(month))
	   {
		   System.out.println("U r in "+month.getValue()); 
	   }
	   else
		   System.out.println("not same");
	}
}
