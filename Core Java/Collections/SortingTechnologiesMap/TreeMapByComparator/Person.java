package SortingTechnologiesMap.TreeMapByComparator;

public class Person
{

	private String name;
	private int age;
	private String address;
	private float salary;
	
	
	public Person(String name, int age, String address, float salary) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getAddress() {
		return address;
	}
	
	public float getSalary() {
		return salary;
	}
	

	@Override
	public String toString() {
		return "[" + name + ", " + age + ", " + address
				+ "," + salary + "]";
	}
	
	
}
