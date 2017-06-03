package BagImplementation;

public class BagImplementationDemo
{

	public static void main(String[] args) 
	{
		Bag<String> bg=new Bag<String>();
		bg.add("Redball");
		bg.add("Greenball");
		bg.add("Redball",2);
		bg.add("Whiteball");
		bg.add("Redball",3);
		bg.add("Greenball",2);
		
		System.out.println("Redball   count "+bg.getCount("Redball"));
		System.out.println("Whiteball count "+bg.getCount("Whiteball"));
		System.out.println("Greenball count "+bg.getCount("Greenball"));
		

	}

}
