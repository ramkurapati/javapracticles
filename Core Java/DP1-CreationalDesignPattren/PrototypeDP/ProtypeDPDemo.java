package PrototypeDP;

public class ProtypeDPDemo {

	public static void main(String[] args) 
	{
		Car car1=new Car("BMW");
		System.out.println("car 1:" + car1);
		System.out.println(car1.hashCode());
		Car car2=(Car) car1.doClone();//new Car();
		System.out.println("car 2:" + car2);
		System.out.println(car2.hashCode());
		
		/*Bus bus1=new Bus("Marcopolo");
		System.out.println("bus 1:" + bus1);
		Bus bus2=(Bus) bus1.doClone();
		System.out.println("bus 2:" + bus2);*/

	}

}
