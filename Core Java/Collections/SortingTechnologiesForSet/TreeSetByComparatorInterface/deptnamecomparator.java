package SortingTechnologiesForSet.TreeSetByComparatorInterface;

import java.util.Comparator;

public class deptnamecomparator implements Comparator<Employee>
{
	public int compare(Employee empX, Employee empY) 
	{
		
		return empX.getDeptname().compareTo(empY.getDeptname());
	}
}
