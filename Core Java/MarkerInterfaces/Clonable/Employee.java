package Clonable;
public class Employee implements Cloneable
{
	 String name; 
	 String address; 
	 
	public Employee(String name, String address)
	{
		this.name = name;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public Employee eclone() throws CloneNotSupportedException
	{
		return (Employee) super.clone();
	}
	
}
