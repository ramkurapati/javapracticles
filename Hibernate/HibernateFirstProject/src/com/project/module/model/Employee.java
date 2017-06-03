package com.project.module.model;

public class Employee
{

	private int empId;
	private String firstName;
	private String lastName;
	private String address;
	private int salary;
	
	
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	public Employee() {}
	
	public Employee(int eid,String fname, String lname,String adrs, int salary)
	{
		this.empId=eid;
		this.firstName = fname;
		this.lastName = lname;
		this.address=adrs;
		this.salary = salary;
		
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", address=" + address
				+ ", salary=" + salary + "]";
	}

}
