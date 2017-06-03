package MethodOverideWithSpecifiers;
   class Base
   {
	   protected  void method1()
	   {
		   System.out.println(" inside method1 in base");
	   }
   
   }
    class Derived extends Base
   {
    	public void method1()
	   {
		   System.out.println(" inside method1 in derived");
	   }
   }
    
    public class SpecifiersDemo
    {
    	
    	public static void main(String[] args)
    	{
    		Base b=new Base();
    		b.method1();
    		Derived d=new Derived();
    		d.method1();
    		Base bd=new Derived();
    		bd.method1();
    	}
    	
    }
   
   
