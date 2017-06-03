package StaticMethods;

public class Basics2
{
	public static int add(int x,int y) //Static method
	{
		int sum=x+y;
		return sum;	
	}
	private static int sub(int x,int y) //Static method
	{
		int sub=x-y;
		return sub;	
	}
	 static int and(int x,int y) //Static method
		{
			
			return x&y;	
		}
	public float add(float a,float b) //instance method
	{
		float  sum=a+b;
		return sum;
	}
	
	private double add2(double c,double d)//helper method
	{
		return c+d;
		
	}
	
	
	public static void main(String[] args)
	{
		
		System.out.println("sum is "+add(5,6));
		System.out.println("sub is "+sub(5,6));
		System.out.println("and opeartion is "+and(1,1));
		Basics2 b2=new Basics2();
		System.out.println("sum is "+b2.add(2.3f,5.4f));
		System.out.println("sum is "+b2.add2(2.34,5.48));
		
	}
}
