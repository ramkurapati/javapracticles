package Abstract;

public abstract class AbstractDemo
{

	public static void main(String[] args) 
	{
		/* Following is not allowed and would raise error */
		//Employee e =new Employee("George W.","Houston, TX",43); 
		//e.mailCheck();
		Salary sal=new Salary("George W.","Houston, TX",43,23000);
		System.out.println("\n Call mailCheck usingEmployee reference--"); 
		
		
		System.out.println(sal.getName());
		System.out.println(sal.getNumber());
		System.out.println(sal.getAddress());
		System.out.println(sal.getSalary());
		System.out.println(sal.computePay());
		
	}

}
