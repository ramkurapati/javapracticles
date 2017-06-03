package Constructor;

class base
{
	base()
	{
		this(1);
		System.out.println(" empty base constructor");
		
	}
	base(String str)
	{
		this.method();
		System.out.println(str+ "  base constructor");
	}
	base(int count)
	{
		this("hello");
		System.out.println(count+ "  base constructor");
	}
	public void method()
	{
		
		System.out.println("method calling");
	}
	
	
}
 class derived extends base
{
	 derived()
		{
		 
		  //super();
		 
		  super("hello");  //only we call one constructor
		 
		 System.out.println("derived constructor");
		 
		}

	 /*base()   //invalid we cannot override a constructor
		{
			System.out.println("base in derived constructor");
		}*/
	
	 void der()
	{
		 
		System.out.println("base in derived constructor");
	}
	 
	
	 
}
public class ConstructorOverriding 
{
	
	public static void main(String[] args) 
	{
		base bs=new base(1);
		bs.method();
		
		/*derived dr=new derived();
		dr.der();*/
		
	

	}

}
