package SingletonDP;

public class Car implements Vehicle{

	private static Car instance;
	String name;
	
	private Car()
	{
	   
	}
	public static Car getInstance()
	{
	if(instance==null) // Lazy instantiation
	{
	   instance = new Car();
	}
	return instance;
	}

	public void model(String name) 
	{
		System.out.println("This car model as "+name);
		
	}
	
	

}
