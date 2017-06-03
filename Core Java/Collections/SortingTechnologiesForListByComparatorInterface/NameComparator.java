package SortingTechnologiesForListByComparatorInterface;

import java.util.Comparator;

class NameComparator implements Comparator<Employee>
{  

  @Override
  public int compare(Employee e1, Employee e2) 
  {
	
	return e1.empname.compareTo(e2.empname);
  }  
  
}  