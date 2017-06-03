package SortingTechnologiesMap.TreeMapByComparator;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

import SortingTechnologiesMap.TreeMapByComparable.Person;

class NameComparator implements Comparator<Person>
{  
	
  @Override
  public int compare(Person p1, Person p2) 
  {
	
	return p1.getName().compareTo(p2.getName());
  }  
  
}  