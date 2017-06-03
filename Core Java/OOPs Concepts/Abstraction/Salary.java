package Abstraction;

public class Salary extends Employee
{
    private double sal;
    
	public Salary(int empid, String empname, String empaddress,double sal) 
	{
		super(empid, empname, empaddress);
		this.sal=sal;
	}
	
	public double getSal() {
		return sal;
	}
	
	public String salinfo()
	{
		
		return "U r salaryinfo created ";
	}
 
	 public void info()// this method override every time this only shows
	    {
	    	System.out.println(" Salary info confidential for "+getEmpname());
	    }
	 public void totaldisplay()
	 {
		 System.out.println(""+getEmpid());
		 System.out.println(""+getEmpname());
		 System.out.println(""+getEmpaddress());
		 System.out.println(personal());
		 System.out.println(""+getSal());
		 System.out.println(salinfo());
		
	 }
		public String EmpDetails() {
			return getEmpname() + " "+getEmpaddress();
		}

	public static void main(String[] args)
	 {
		 Salary s=new Salary(1234, "Kumar", "Gujarat", 24450.45);
		 s.totaldisplay();
		 s.info();
		 System.out.println(s.EmpDetails());
		 Employee emp=new Salary(1235, "mohan", "AP", 27450.95);
		 emp.info();
		 System.out.println(emp.EmpDetails());
		 
		 
	 }

	
}
