package Association;

import java.util.ArrayList;
import java.util.List;

public class AssociationDemo
{

	public static void main(String[] args) 
	{
		Company comp=new Company("ASAP",100,"SilkBoard");
		Employee emp1=new Employee(1231,"ram",comp);
		Employee emp2=new Employee(1232,"raj",comp); 
		List<Employee> list=new ArrayList<Employee>();
		list.add(emp1);
		list.add(emp2);
		for(Employee emp:list)
		{
			
		System.out.println("Emp name  "+emp.getEmpname());
		System.out.println("Emp id  "+emp.getEmpid());
		System.out.println("Emp company  "+emp.getCompany().getCompname());
		System.out.println("--------------------------------------------------");
		}
	}

}
