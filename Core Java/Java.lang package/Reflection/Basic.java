package Reflection;

import java.util.Date;

public class Basic
{
  public static void main(String[] args)
  {
	  try
	  {
		Class<?> cls=Class.forName("Reflection.A");
		boolean b1=cls.isInstance(new Integer(37));
		System.out.println(b1);
		boolean b2=cls.isInstance(new A());
		System.out.println(b2);
		Class<?> cls2=Class.forName("java.util.Date");
		System.out.println(cls2.isInstance(new Date()));
	  }
	  catch(Throwable e)
	  {
		  System.err.println(e);
	  }
  }
}
