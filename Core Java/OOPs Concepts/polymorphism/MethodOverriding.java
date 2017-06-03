package polymorphism;
class Sample1
{
	void root(int a)
	{
		System.out.println("squre root of "+ a + " is "+Math.sqrt(a));
	}
}
class Sample2 extends Sample1
{
	void root(int a)
	{
		System.out.println("squre of "+ a + " is "+(a*a));
	}
}
public class MethodOverriding {

	public static void main(String[] args)
	{
		Sample2 s2=new Sample2();
		s2.root(16);
		Sample1 s1=new Sample1();
		s1.root(16);
	}
}
