package ClassLoaders;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;



public class WaysToLoadAClass 
{
	
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, ClassNotFoundException, IOException 
	{
		//WAY 1 to Load Student Class
		System.out.println("By using new keyword ");
		Student obj1=new Student("ram");
		System.out.println(" "+obj1.name);
		System.out.println(" "+Student.schoolname);
		
		//WAY 2 to Load Student Class
		System.out.println("By using class.forName() ");
	  try 
	  {
		Class<?> cls=Class.forName("ClassLoaders.Student");
		Constructor<?> cnstr = cls.getConstructor(String.class);//constructor must be public then only it works
		Student obj2=(Student) cnstr.newInstance("mohan");
		System.out.println(" "+obj2.name);
		
	  } 
	  catch (ClassNotFoundException e) 
	  {
		e.printStackTrace();
	  }
	//WAY 3 to Load Student Class
	  System.out.println("By using Classloder.loadClass() ");
	  ClassLoader cloader = ClassLoader.getSystemClassLoader();
	  try
	  {
		   Class<?> cls2=cloader.loadClass("ClassLoaders.Student");
		   Constructor<?> cnstr2 = cls2.getConstructor(String.class);//constructor must be public then only it works
			Student obj3=(Student) cnstr2.newInstance("naidu");
			System.out.println(" "+obj3.name);
		   
	   } 
	  catch (ClassNotFoundException e) 
	  {
		
		e.printStackTrace();
	   }
	   
	}

}
