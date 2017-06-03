package ClassLoaders;

public class ClassDemo 
{
	public static void main(String[] args) 
	{

		  try 
		    {
		        Class cls = Class.forName("ClassLoaders.ClassDemo");
		        
		        // returns the ClassLoader object
		        ClassLoader cLoader = cls.getClassLoader();
		       
		        /* returns the Class object associated with the class or interface 
		        with the given string name, using the given classloader. */
		        
		        Class cls2 = Class.forName("java.util.Date",true, cLoader);       
		          
		        // returns the name of the class
		        System.out.println("Class = " + cls.getName());
		        System.out.println("Class = " + cls2.getName()); 
		        Class cls3=Class.forName("oracle.jdbc.driver.OracleDriver");  
		        System.out.println(" "+cls3.getClassLoader());
		        System.out.println(" "+cls3.getSimpleName());
		     }
		     catch(ClassNotFoundException ex)
		     {
		        System.out.println(ex.toString());
		     }

	}

}
