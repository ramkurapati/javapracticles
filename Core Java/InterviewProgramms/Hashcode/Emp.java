package Hashcode;

public class Emp {
private int age ;
private String name="ram";
private String name2="mohan";
	
	public Emp( int age )
	{
		super();
		this.age = age;
	}
	
	public int hashCode()
	{
		return age;
	}
	public int hashcode2()
	{
		return name.hashCode()+name2.hashCode();
		
	}
}
