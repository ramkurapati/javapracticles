package GenericsOnObjects;

public class Employee 
{
	String ename;
	Long eid;
	
	Employee(String ename,Long eid)
	{
		this.ename=ename;
		this.eid=eid;
	}
	public void einfo()
	{
	   System.out.println("Department Name : "+eid);
	   System.out.println("Department Name : "+ename);
	   
	}
}
