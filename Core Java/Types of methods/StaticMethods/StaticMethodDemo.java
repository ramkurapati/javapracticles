package StaticMethods;

public class StaticMethodDemo
{
	public static int add(int x,int y) //Static method
	{
		int sum=x+y;
		sub(x,y);
		return sum;
	}
	private static int sub(int x,int y) //Static method
	{
		int sub=x-y;
		//and(x,y); error we can't call normal method from static method
		return sub;
	}
	   int and(int x,int y) 
		{
		  
			return add(x,y);	
		}
	
	public static void main(String[] args)
	{
		
		System.out.println("sum is "+add(5,6));
		System.out.println("sub is "+sub(5,6));
		
		StaticMethodDemo b2=null;
		//System.out.println("and is "+b2.and(23,5)); it gives null pointer exception
		System.out.println("sum is "+b2.add(2,5));
		System.out.println("sum is "+b2.sub(23,5));
		 b2=new StaticMethodDemo();
		System.out.println("and is "+b2.and(23,5));
		
	}
}
