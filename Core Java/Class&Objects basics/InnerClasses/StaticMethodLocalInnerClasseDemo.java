package InnerClasses;

public class StaticMethodLocalInnerClasseDemo 
{

	private static String x = "static outer";
	 
	public static void doStuff()
	{
		class MyInner
		{
			public void seeOuter() 
			{
				System.out.println("x is " + x);
			}
		}
 
		MyInner i = new MyInner();
		i.seeOuter();
	}
 
	
	public static void main(String[] args) 
	{
		StaticMethodLocalInnerClasseDemo.doStuff();

	}

}
