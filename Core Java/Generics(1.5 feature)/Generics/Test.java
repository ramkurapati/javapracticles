package Generics;

public class Test<T> 
{
	
	    private T n1,n2;
	    
	    Test (T n1,T n2) 
	    {
	     	this.n1=n1;
	     	this.n2=n2;
	     	
	    }
		public T getn1()
		{
			return n1;
	    }
		
		public T getn2()
		{
			return n2;
	    }
		
	   

 public static void main(String[] args)
 {
	 Test<Integer> iadd=new Test<>(80000,20000);
     int IAddition=iadd.getn1()+iadd.getn2();
     System.out.println(" Integrs addition = "+IAddition);
     
     Test<Double> dadd=new Test<>(23.4634,27.5434);
     double dAddition=dadd.getn1()+dadd.getn2();
     System.out.println(" Doubles addition = "+dAddition);
     
     Test<Float> fadd=new Test<>(23.4634f,27.5434f);
     float fAddition=fadd.getn1()+fadd.getn2();
     System.out.println(" Floates addition = "+fAddition);
     
     Test<Long> ladd=new Test<>(23L,27L);
     Long lAddition=ladd.getn1()+ladd.getn2();
     System.out.println(" Longs addition = "+lAddition);
     
     Test<String> sadd=new Test<>("ram","mohan");
     String sAddition=sadd.getn1()+sadd.getn2();
     System.out.println(" Strings addition = "+sAddition);
     
     

 }

}
