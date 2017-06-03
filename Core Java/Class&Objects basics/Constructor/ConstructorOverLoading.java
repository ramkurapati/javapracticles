package Constructor;

public class ConstructorOverLoading
{

	ConstructorOverLoading()
	{
		
		System.out.println("empty constructor");
	}
	ConstructorOverLoading(double x)
	{
		System.out.println("with one argument double "+ (x) +" constructor");
	}
	ConstructorOverLoading(long x)
	{
		System.out.println("with one argument long "+ (x) +" constructor");
	}
	
	
	public static void main(String[] args)
	{
		new ConstructorOverLoading();
		new ConstructorOverLoading(69L);
		new ConstructorOverLoading(69.098f);
		new ConstructorOverLoading(69.098D);
	}
}

