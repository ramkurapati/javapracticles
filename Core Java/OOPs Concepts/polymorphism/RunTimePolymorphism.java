package polymorphism;
class Vehicle
{
	void speed()
	{
		System.out.println("vehicle speed");
	}
	void color()
	{
		System.out.println("vehicle color");
	}
	static void shape()
	{
		System.out.println("vehicle shape");
	}
}
class Car extends Vehicle
{
	void speed()
	{
		System.out.println("Car speed");
	}
	static void shape()
	{
		System.out.println("Car shape");
	}
	void model()
	{
		System.out.println("Car model");
	}
	
}
/*class Bus extends Vehicle
{
	void speed()
	{
		System.out.println("Bus speed");
	}
	static void shape()
	{
		System.out.println("Bus shape");
	}
	void model()
	{
		System.out.println("Bus model");
	}
	
}*/
public class RunTimePolymorphism 
{
	public static void main(String[] args)
	{  
		Vehicle v=new Car();

		v.color();
		v.speed();
		v.shape();
		//v.model();
		
		/*v=new Bus();
		v.color();
		v.speed();
		v.shape();
	//	v.model();
		
		*/
	}

}
