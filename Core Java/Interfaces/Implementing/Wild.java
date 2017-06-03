package Implementing;

public class Wild implements AnimalInterface 
{

	public void eat()
	{
		System.out.println("It eats Non-Veg");
	}

	
	public void place() 
	{
		System.out.println("It lived in Forest");
	}

	public void hunting()
	{
		System.out.println("It can hunt");
	}
	
	public static void main(String[] args)
	{
		System.out.println("By using AnimalInterface");
		AnimalInterface ai=new Wild();
		ai.eat();
		ai.place();
		System.out.println("\n" +
				"By using Wild class object");
		Wild w=new Wild();
		w.eat();
		w.place();
		w.hunting();
	
	}

	
	
}
