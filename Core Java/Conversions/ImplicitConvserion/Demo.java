package ImplicitConvserion;

public class Demo {

	public static void main(String[] args) 
	{
		char c='M';
		//short s=c;
		int i=c;
		float ft=c;
		double d=c;
		long l=c;
		
		/*System.out.println("  "+c);
		System.out.println("  "+i);
		System.out.println("  "+ft);
		System.out.println("  "+d);
		System.out.println("  "+l);*/
		
		int i2=77;
		//char c2=i2; error
		float ft2=i2;
		double d2=i2;
		long l2=i2;
		
		System.out.println("  "+i2);
		System.out.println("  "+ft2);
		System.out.println("  "+d2);
		System.out.println("  "+l2);
		
	}

}
