package ExceptionsWithInheritance;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;


class ram 
{
	void m1() throws  IllegalArgumentException
	{
		
	}
}
class mohan extends ram 
{
	void m1()  throws ArithmeticException
	{
		
	}
}


public class type1 {
	public static void main(String[] args) {
		
		String a="ram";
		String b="mohan";
		System.out.println(a+b);
		
		int c=2;int d=3;
		System.out.println(c+d);
	}

}
