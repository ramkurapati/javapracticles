package SortingTechnologiesForSet.TreeSetByComparatorInterface;

import java.util.Comparator;

public class agecomparator implements Comparator<Employee>
{
	public int compare(Employee empX, Employee empY) 
	{
		
		return empX.getAge()-empY.getAge();
	}
}
