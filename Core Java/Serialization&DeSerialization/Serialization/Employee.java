package Serialization;

import java.io.Serializable;

public class Employee implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = -991396417360596961L;
	public Employee(String name, String address, int number)
	{
		super();
		this.name = name;
		this.address = address;
		this.number = number;
	}
	String name; 
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
	public long getSSN() {
		return SSN;
	}
	public void setSSN(long sSN) {
		SSN = sSN;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	 String address; 
	 long SSN;
	 int number;
}
