package GenericsOnObjects;

public class Department
{

	String dname;
	Long did;
	
	Department(String dname,Long did)
	{
		this.dname=dname;
		this.did=did;
	}
	public void dinfo()
	{
	   System.out.println("Employee Name : "+did);
	   System.out.println("Department Name : "+dname);
	   
	}
}
