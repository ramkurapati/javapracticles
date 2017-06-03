package Final;

public class mainDemo
{
	public static void main(String[] args)
	{
		FinalAccessDemo fad=new FinalAccessDemo();
		fad.store("mohan", 25);
		derived drd=new derived();
		drd.store2(989,"tdp,atp");
		drd.display();
		fad.display();
	}
}
