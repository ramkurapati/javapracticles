package Reflection;

import java.lang.reflect.Method;

public class MethodFindDemo {

	@SuppressWarnings("unused")
	private int f1(Object o,int x)throws NullPointerException
	{
		if(o==null)
			throw new NullPointerException();
		return x;	
	}
	public static void main(String[] args)
	{
		try
		{
			Class cls=Class.forName("Reflection.MethodFindDemo");
			Method methlist[]=cls.getDeclaredMethods();
			for(int i=0;i<methlist.length;i++)
			{
				Method m=methlist[i];
				System.out.println("name "+m.getName());
				System.out.println("name "+m.getDeclaringClass());
				Class pvec[]=m.getParameterTypes();
				for(int j=0;j<pvec.length;j++)
					System.out.println("param "+j+" " +pvec[j]);
				Class evec[]=m.getExceptionTypes();
				for(int j=0;j<evec.length;j++)
					System.out.println("exeception "+j+" " +evec[j]);
				System.out.println("Return types " +m.getReturnType());
			}
		}
		  catch(Throwable e)
		  {
			  System.err.println(e);
		  }
	}
}
