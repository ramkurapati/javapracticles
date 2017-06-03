package SortingTechnologiesForSet.TreeSetByComparatorInterface;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SortingByComparatorInterface 
{

	public static void main(String[] args)
	{
		Employee emp1=new Employee("Manohar","Accounts",32);
		Employee emp2=new Employee("Vasu","Marketing",25);
		Employee emp3=new Employee("Sumathi","Transport",37);
		Employee emp4=new Employee("Anusha","Administration",27);
		Employee emp5=new Employee("Jhon","Communication",22);
		
		Set<Employee> namesetcomp=new TreeSet<Employee>(new namecomparator());
		namesetcomp.add(emp1);
		namesetcomp.add(emp2);
		namesetcomp.add(emp3);
		namesetcomp.add(emp4);
		namesetcomp.add(emp5);
		System.out.println("sort by using empname");
		Iterator<Employee> it=namesetcomp.iterator();
		 while(it.hasNext())
	      {
	    	  System.out.println(it.next());  
	      }

		Set<Employee> deptnamesetcomp=new TreeSet<Employee>(new deptnamecomparator());
		deptnamesetcomp.addAll(namesetcomp);
		System.out.println("sort by using deptname");
		Iterator<Employee> it2=deptnamesetcomp.iterator();
		 while(it2.hasNext())
	      {
	    	  System.out.println(it2.next());  
	      }

		 Set<Employee> agesetcomp=new TreeSet<Employee>(new agecomparator());
		 agesetcomp.addAll(namesetcomp);
		 System.out.println("sort by using emp age");
			Iterator<Employee> it3=agesetcomp.iterator();
			 while(it3.hasNext())
		      {
		    	  System.out.println(it3.next());  
		      }
	}

}
