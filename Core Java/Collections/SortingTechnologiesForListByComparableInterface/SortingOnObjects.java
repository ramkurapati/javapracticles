package SortingTechnologiesForListByComparableInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class SortingOnObjects {

	public static void main(String[] args)
	{
		Employee emp1=new Employee("Manohar","Accounts",32);
		Employee emp2=new Employee("Vasu","Marketing",25);
		Employee emp3=new Employee("Sumathi","Transport",37);
		Employee emp4=new Employee("Anusha","Administration",27);
		Employee emp5=new Employee("Jhon","Communication",22);
		
		ArrayList<Employee> emplist=new ArrayList<Employee>();
		emplist.add(emp1);
		emplist.add(emp2);
		emplist.add(emp3);
		emplist.add(emp4);
		emplist.add(emp5);
		
		Collections.sort(emplist);
		
		/*Iterator<Employee> it=emplist.iterator();
	      while(it.hasNext())
	      {
	    	  System.out.println(it.next());  
	      }*/
		

		for(Employee e:emplist){
			System.out.println(e);
		}
		

	}

}
