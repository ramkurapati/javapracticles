package hashcodeANDequalsMethods;

public class hashcodeANDequalsDemoOnObjects
{

	public static void main(String[] args)
	{
		Employee e1=new Employee(); 
		e1.setName("ramu");
		e1.setAge(12);
		System.out.println("emp1 hashcode : " +e1.hashCode());
		
		Employee e2=new Employee();
		e2.setName("ramu");
		e2.setAge(12);
		System.out.println("emp2 hashcode : " +e2.hashCode());
		
		System.out.println(e1.equals(e2)); 
		System.out.println(e1==e2);
		
		
		
		
		/*Employee e3=e2;
		System.out.println(e3.hashCode() +" "+e2.hashCode() );
		System.out.println(e3.equals(e2));
		System.out.println(e3==e2);*/
		
		/*Department dept=new Department();
		dept.setDid(445);
		dept.setDname("Adminstration");
		System.out.println(dept.hashCode());
		
		Department dept2=new Department();
		dept2.setDid(445);
		dept2.setDname("Adminstration");
		System.out.println(dept2.hashCode());*/
	}
	
}


	
	


