package SortingTechnologiesForSet.TreeSetByComparatorInterface;

import java.util.Comparator;

public class namecomparator implements Comparator<Employee>
{
	public int compare(Employee empX, Employee empY) 
	{
		
		return empX.empname.compareTo(empY.empname);
	}
}
