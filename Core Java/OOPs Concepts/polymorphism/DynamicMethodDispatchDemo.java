package polymorphism;

class Game
{
	public void type()
	{
		System.out.println("Indoor&Outdoor played");
	}
}
class Cricket extends Game
{
	
	public void type()
	{
		System.out.println("Outdoor played");
	}
}
public class DynamicMethodDispatchDemo {
	public static void main(String[] args)
	{
		Game g=new Game();
		//Cricket c=new Game(); incompatable
		//Game Gc=new Cricket();//Static mode
		Cricket c=new Cricket();
		//g.type();
		//c.type();
		//Gc.type();
		
		g=c;//Dynamic mode
		g.type();
		

	}

}
