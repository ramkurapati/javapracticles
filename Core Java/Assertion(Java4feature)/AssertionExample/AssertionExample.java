package AssertionExample;

import java.util.Scanner;

public class AssertionExample
{  
	 public static void main(String[] args )
	 {  
	  
	  Scanner scanner2 = new Scanner( System.in );  
	  System.out.print("Enter ur age ");  
	    
	  int value = scanner2.nextInt();  
	  
	  assert value>=18  :" Not valid";  
	  
	  System.out.println("value is "+value);  
	 }   
}  
