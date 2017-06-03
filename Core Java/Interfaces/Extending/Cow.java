package Extending;

public class Cow implements MammalInterface
{

	public void eat() {
		
		System.out.println("It eats Veg");
	}

	public void place() {
		
		System.out.println("It lived in near to Residential areas");
	}
	
	public void behaviour()
	{
		System.out.println("Soft in behaviour");
		
	}

	public void uniqueness() {
		
		System.out.println("They grow their childs by giving her milk");
	}


	public static void main(String[] args) 
	{
		
          Cow c=new Cow();
          c.behaviour();
          c.eat();
          c.place();
          c.uniqueness();
         
	}

	
}
