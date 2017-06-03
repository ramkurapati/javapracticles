package SortingTechnologiesForListByComparatorInterface;

public class Employee
{
    public String empname;
    public String deptname;
    public int age;
	
    public Employee(String empname, String deptname, int age) 
	{
		
		this.empname = empname;
		this.deptname = deptname;
		this.age = age;
	}
    
	public String getEmpname() {
		return empname;
	}

	public String getDeptname() {
		return deptname;
	}

	public int getAge() {
		return age;
	}

	 public String toString() 
	 {
	        return "[name=" + this.empname + ", deptname=" + this.deptname + ", age=" + this.age + "]";
	  }


}
