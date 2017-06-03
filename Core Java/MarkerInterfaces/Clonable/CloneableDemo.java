package Clonable;

public class CloneableDemo 
{

	public static void main(String[] args) throws CloneNotSupportedException 
	{
		Employee emp1=new Employee("ram", "banglore");
		Employee emp2=emp1.eclone();
		System.out.println(emp2.getName());
        System.out.println(emp2.getAddress());
	}

}
