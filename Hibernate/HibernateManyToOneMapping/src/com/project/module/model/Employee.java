package com.project.module.model;

public class Employee
{

	private int empId;
	private String firstName;
	private String lastName;
	private int salary;
	private Department depot;
	
	
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
	
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	public Department getDepot() {
		return depot;
	}
	public void setDepot(Department depot) {
		this.depot = depot;
	}
	public Employee() {}
	
	public Employee(int empId, String firstName, String lastName,
			 int salary) {
		
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", salary=" + salary + "]";
	}
	
	

}
