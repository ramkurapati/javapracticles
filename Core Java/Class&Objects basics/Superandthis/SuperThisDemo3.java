package Superandthis;

class Base3
{
	protected int len;
	protected int bred;
	Base3(int x,int y)
	{
		this.area(this.len=x,this.bred=y);
	}
	void area(int len,int bred)
	{
		System.out.println(" area "+ len*bred);
	}
}
class Derived3 extends Base3
{
    int ht;
	Derived3(int x, int y,int z)
	{
		super(x, y);
		this.volume(z);
		
	}
	
	void volume(int ht)
	{
		System.out.println(" volume "+ len*bred*ht);
	}
	
}
public class SuperThisDemo3
{
     
	public static void main(String[] args)
	{
		
		new Derived3(1,2,3);
		
	}

}
