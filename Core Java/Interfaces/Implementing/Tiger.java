package Implementing;

public class Tiger implements AnimalInterface,WildInterface
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
	
	public void tigerinfo()
	{
		System.out.println("Tiger has Black and Yellow scracthes on it body");
	}
	
	public static void main(String[] args) 
	{
		Tiger t=new Tiger();
		System.out.println(t.name);
		t.tigerinfo();
		t.place();
		t.hunting();
		t.eat();
		
		
		
	}


}
