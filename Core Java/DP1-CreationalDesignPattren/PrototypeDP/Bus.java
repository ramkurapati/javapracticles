package PrototypeDP;

public class Bus implements Vehicle{

	String name;
	public Bus(String name) 
	{
		this.name=name;
	}


	public Vehicle doClone() {
		
		return new Bus(name);
	}

	public String toString() 
	{
		return "This Bus as named " + name;
	}
}
