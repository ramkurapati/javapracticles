package polymorphism;

class Number
{
	public void number(int a)
	{
	   System.out.println("number(int) from summation "+a);	
	}
}
class Number2 extends Number
{
	
	
	
	public void number(double a)
	{
	   System.out.println("number(double) from summation2 "+a);	
	}
}
class Number3 extends Number
{
	public void number(int a)
	{
	   System.out.println("number(int) from summation3 "+a);	
	}
	public void number(long a)
	{
	   System.out.println("number(long) from summation3 "+a);	
	}
	
}
public class ComplieTimePloymorphism 
{
	public static void main(String[] args) 
	{
		
		Number n3=new Number3();
		//Number3 n3=new Number3();
		
		
		
		//n3.number(7); //static polymorphism
		//n3.number(7L); //error in complie time
		Number2 n2=new Number2();
		n2.number(7);
		n2.number(2.567);
		Number n=new Number2();
		//n.number(7d);	//error in complie time

	}

}
