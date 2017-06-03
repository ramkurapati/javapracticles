package ArrayOfObjects;

public class Employee 
{
   String empname;
   int age;
   String deptname;
   
public Employee(String empname, int age, String deptname)
{
	this.empname = empname;
	this.age = age;
	this.deptname = deptname;
}
public String getEmpname() {
	return empname;
}

public int getAge() {
	return age;
}

public String getDeptname() {
	return deptname;
}


}
