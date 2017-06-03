package polymorphism;

public class MethodOverloading2 {
	
	public void m1(Object o)
	{
		System.out.println("Hi");
	}
	public void m1(String s)
	{
		System.out.println("Hello");
	}

	 public static void main(String arg[])
	 {
		 MethodOverloading2 d=new MethodOverloading2();
		 //d.m1("Ram");
		 d.m1(null);
		 
	 }
}
