package MiscOperators;
public class TerinaryoperatorDemo {


	int a,b;
	public int add(int x,int y)
	{
		a=x;b=y;
		return a+b;
	}
	public int sub(int x,int y)
	{
		a=x;b=y;
		return a-b;
	}
	public class otherclass
	{
		String fullname;
		otherclass(String name)
		{
			fullname=name+"NAIDU";
		}
	}

	public static void main(String[] args) 
	{
		
		TerinaryoperatorDemo to=new TerinaryoperatorDemo();
		 otherclass oc=to.new otherclass("RAMMOHAN");
		
		int result=(oc.equals(null))?to.add(4, 5):to.sub(5, 6);
		int result2=(oc instanceof otherclass)?to.add(4, 5):to.sub(5, 6);
		
		System.out.println("result is "+result);
		System.out.println("result is "+result2);
	}

}
