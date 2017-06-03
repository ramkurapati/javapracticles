package Constructor;

public class ConstructorDemo
{
     int z=10;
	ConstructorDemo()
	{
		this.z=0;
		System.out.println(" Empty constructor "+z);
	}
	
	private ConstructorDemo(int y)
	{
		int x=z+y;
		System.out.println(" constructor with arugments "+x);
	}
	
	public static void main(String[] args) 
	{
		
		new ConstructorDemo();
		new ConstructorDemo(89);
		
		
	}

}
