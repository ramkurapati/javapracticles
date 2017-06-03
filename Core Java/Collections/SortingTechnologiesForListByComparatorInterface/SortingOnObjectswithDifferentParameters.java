package SortingTechnologiesForListByComparatorInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class SortingOnObjectswithDifferentParameters {

	public static void main(String[] args)
	{
		Employee emp1=new Employee("Manohar","Accounts",32);
		Employee emp2=new Employee("Vasu","Marketing",25);
		Employee emp3=new Employee("Sumathi","Transport",30);
		Employee emp4=new Employee("Anusha","Administration",27);
		Employee emp5=new Employee("Jhon","Communication",22);
		
		ArrayList<Employee> emplist=new ArrayList<Employee>();
		emplist.add(emp1);
		emplist.add(emp2);
		emplist.add(emp3);
		emplist.add(emp4);
		emplist.add(emp5);
		System.out.println("sort by using empname");
		
		Collections.sort(emplist,new NameComparator());
		Iterator<Employee> it=emplist.iterator();
	      while(it.hasNext())
	      {
	    	  System.out.println(it.next());  
	      }
	      
	      System.out.println("-------------------sort by using deptname---------------------");
	      Collections.sort(emplist,new DeptNameComparator());
	      Iterator<Employee> it2=emplist.iterator();
	      while(it2.hasNext())
	      {
	    	  System.out.println(it2.next());  
	      }
	      
	      System.out.println("------------------sort by using employee age-------------------");
	      Collections.sort(emplist,new AgeComparator());
	      Iterator<Employee> it3=emplist.iterator();
	      while(it3.hasNext())
	      {
	    	  System.out.println(it3.next());  
	      }
		

	}

}
