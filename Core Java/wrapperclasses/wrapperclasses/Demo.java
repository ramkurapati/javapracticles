package wrapperclasses;

public class Demo {
	
	public static void main(String[] args)
	{
		Integer obj1 = new Integer(34); 
		Integer obj2 = new Integer("34"); 
		
		int x=obj1.intValue(); 
		int y=obj2.intValue();
		int z=obj1 .intValue()+ 7;
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		
		Integer obj3 = 34; 
		int a=obj3; 
		int b=obj3 + 7; 
		System.out.println(obj3);
		System.out.println(a);
		System.out.println(b);
	
		int p = Integer.parseInt("34"); // x=34 
		double q = Double.parseDouble("34.7"); // y =34.7 
		String s1= String.valueOf('a'); // s1="a" 
		String s2=String.valueOf(true); // s2="true" 
		System.out.println(p);
		System.out.println(q);
		System.out.println(s1);
		System.out.println(s2);
		
		

		
		
		
	}

}
