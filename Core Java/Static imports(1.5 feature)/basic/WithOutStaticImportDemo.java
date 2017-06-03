package basic;

public class WithOutStaticImportDemo 
{
	 public static void main(String a[])
	 {
	        System.out.println("Increment value: "+MyStaticMembClass.INCREMENT);
	        
	        int count = 10;
	        System.out.println("Increment count: "+MyStaticMembClass.incrementNumber(count));
	        
	        int count2 =MyStaticMembClass.incrementNumber(count);
	        System.out.println("Increment count: "+MyStaticMembClass.incrementNumber(count2));
	    }
}
