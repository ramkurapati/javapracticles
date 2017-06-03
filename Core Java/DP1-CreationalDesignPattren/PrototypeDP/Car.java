package PrototypeDP;

public class Car implements Vehicle
{
    String name;
    
    public Car(String name)
    {
    	this.name=name;
    }
	
	public Car() {
		// TODO Auto-generated constructor stub
	}

	public Vehicle doClone() {
		
		return new Car(name);
	}

	public String toString() 
	{
		return "This Car as named " + name;
	}
}
