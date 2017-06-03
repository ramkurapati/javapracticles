package ClassLoaders;

public class TypesOfClassLoadersDemo {

	
	public static void main(String[] args) 
	{
		ClassLoader cl = TypesOfClassLoadersDemo.class.getClassLoader();//cl child class
		System.out.println(" " +cl);//ApplicationClassLoader
		System.out.println(" " +cl.getParent());//ExtensionClassLoader
		System.out.println(" " +String.class.getClassLoader());//Bootstrap ClassLoader it doesn't have parent ,that why it shows null 
		System.out.println(" " +String.class.getClassLoader().getParent());//null pointer exception
		try 
	    {
	        Class aClass = cl.loadClass("ClassLoaders.ClassLoaderTest");
	        System.out.println("aClass.getName() = " + aClass.getName());
	    } 
	    catch (ClassNotFoundException e)
	    {
	        e.printStackTrace();
	    }

	}

}
