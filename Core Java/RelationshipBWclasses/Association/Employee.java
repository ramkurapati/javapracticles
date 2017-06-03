package Association;

public class Employee 
{
	private int empid;
	private String empname;
	private Company company;
	
    public Employee(int empid, String empname, Company company) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.company = company;
	}
	public int getEmpid() {
		return empid;
	}
	
	public String getEmpname() {
		return empname;
	}
	public Company getCompany()
	{
		return company;
	}
	
	
}
