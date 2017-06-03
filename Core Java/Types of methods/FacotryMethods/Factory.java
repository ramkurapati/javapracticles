package FacotryMethods;

import java.util.Calendar;
import java.util.Scanner;

public class Factory {
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException
	{
		 Scanner s=new Scanner(System.in);
  	     System.out.println("Enter a real number");
         int realnumber =s.nextInt();
         System.out.println("Enter a imaginary number");
         int imgnumber =s.nextInt();
         ComplexNumber cn=new ComplexNumber(realnumber, imgnumber);
        // Class cls = cn.getClass();
        // Object obj = cls.newInstance();
         
	}

}
