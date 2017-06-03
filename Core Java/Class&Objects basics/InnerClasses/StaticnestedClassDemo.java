package InnerClasses;

class Outer 
{
	
	static class Inner 
	{
		void go() 
		{
			System.out.println("Inner class reference is: " + this);
		}
	}
}
public class StaticnestedClassDemo 
{
	public static void main(String[] args)
	{
	    Outer.Inner oi = new Outer.Inner();
	    oi.go();
	    
	    
	}
}
