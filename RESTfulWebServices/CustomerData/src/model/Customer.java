package model;


public class Customer 
{
  private int custid; 
  private String name;
  private int age;
  private String address;
  
  Customer()
  {
	  
  }
  
public Customer(int custid, String name, int age, String address) {
	this.custid = custid;
	this.name = name;
	this.age = age;
	this.address = address;
}
public int getCustid() {
	return custid;
}
public void setCustid(int custid) {
	this.custid = custid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}

  
}
