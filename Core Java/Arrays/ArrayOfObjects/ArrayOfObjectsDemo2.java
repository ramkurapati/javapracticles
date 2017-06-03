package ArrayOfObjects;

public class ArrayOfObjectsDemo2 
{
	public static void main(String[] args)
	{
		Employee[] emp=new Employee[5];
		
		emp[0]=new Employee("Damini",25,"Sales");
		emp[1]=new Employee("Sharma",22,"Accounts");
		emp[2]=new Employee("Anup",24,"Management");
		emp[3]=new Employee("Pallavi",22,"Marketing");
		emp[4]=new Employee("Santhosh",29,"Administration");
		
	
		for(int i=0;i<emp.length;i++)
		{
			System.out.println(""+emp[i].getEmpname()+"  "+emp[i].getDeptname()+"  "+emp[i].getAge());
		}
	}

}
