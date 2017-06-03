package SortingTechnologiesMap.TreeMapByComparator;

import java.util.Comparator;

public class AgeComparator implements Comparator<Person> {

	 @Override
	  public int compare(Person e1, Person e2) 
	  {
		
		return e1.getAge()-e2.getAge();
	  }  
}
