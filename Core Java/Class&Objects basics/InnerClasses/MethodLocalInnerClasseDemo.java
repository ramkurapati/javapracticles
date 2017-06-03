package InnerClasses;

public class MethodLocalInnerClasseDemo 
{
	private String x = "outer";
	 
	public void doStuff() //inside this method class defined
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
		MethodLocalInnerClasseDemo o = new MethodLocalInnerClasseDemo();
		o.doStuff();
		
	}
}
