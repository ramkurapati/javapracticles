package SortingTechnologiesForSet.TreeSetByComparableInterface;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
public class SortingByComparableInterface
{

	public static void main(String[] args)
	{
		Employee emp1=new Employee("Manohar","Accounts",32);
		Employee emp2=new Employee("Vasu","Marketing",25);
		Employee emp3=new Employee("Sumathi","Transport",37);
		Employee emp4=new Employee("Anusha","Administration",27);
		Employee emp5=new Employee("Jhon","Communication",22);
		
		Set<Employee> empset=new HashSet<Employee>();
		empset.add(emp1);
		empset.add(emp2);
		empset.add(emp3);
		empset.add(emp4);
		empset.add(emp5);
		
		Set<Employee> tset=new TreeSet<Employee>(empset);
		//tset.addAll(empset);
		/*Iterator<Employee> it=tset.iterator();
	      while(it.hasNext())
	      {
	    	  System.out.println(it.next());  
	      }*/

	      for(Employee e:tset){
	    	  System.out.println(e);
	    	  
	      }
	}

}
