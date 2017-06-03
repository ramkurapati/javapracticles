package Superandthis;

class Base
{
	int len,bred;
	Base(int x,int y)
	{
		len=x;
		bred=y;
	}
	int area()
	{
		return len*bred;
	}
}
class Derived extends Base
{
    int ht;
	Derived(int p, int q,int r)
	{
		super(p, q);
		ht=r;
	}
	
	double volume()
	{
		return len*bred*ht;
	}
	
}
public class SuperThisDemo
{
     
	public static void main(String[] args)
	{
		Derived d=new Derived(1,2,3);
		System.out.println("Area "+d.area());
		System.out.println("Volume "+d.volume());
	}

}
