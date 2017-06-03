package FinalizeMethod;

public class mainDemo 
{

	
	public static void main(String[] args) throws Throwable
	{
		FinalizemethodDemo fmd=new FinalizemethodDemo(24,"ram");
		fmd.dispaly();
		
		derived d=new derived(25,"ram" );
		d.dispaly2();
		d.finalize();
	
		
	}
}
