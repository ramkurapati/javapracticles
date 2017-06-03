package com.project.module.model;

public class Address {

	private int empId;
	private String hNo;
	private String laneNo;
	private String state;
	private String postalPin;
	private String country;
	private Employee employee;
	
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String gethNo() {
		return hNo;
	}
	public void sethNo(String hNo) {
		this.hNo = hNo;
	}
	public String getLaneNo() {
		return laneNo;
	}
	public void setLaneNo(String laneNo) {
		this.laneNo = laneNo;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPostalPin() {
		return postalPin;
	}
	public void setPostalPin(String postalPin) {
		this.postalPin = postalPin;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public Address(String hNo, String laneNo,
			String state, String postalPin, String country) {
		this.hNo = hNo;
		this.laneNo = laneNo;
		this.state = state;
		this.postalPin = postalPin;
		this.country = country;
	}
	@Override
	public String toString() {
		return "EmployeeAddress [hNo=" + hNo + ", laneNo=" + laneNo
				+ ", state=" + state + ", postalPin=" + postalPin
				+ ", country=" + country + "]";
	}
	
	
}
