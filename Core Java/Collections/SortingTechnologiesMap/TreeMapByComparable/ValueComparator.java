package SortingTechnologiesMap.TreeMapByComparable;

import java.util.Comparator;
import java.util.Map;

public class ValueComparator implements Comparator<Person> 
{
	  Map<Person,String> map;
	 
	  public ValueComparator(Map<Person,String> map)
	  {
	    this.map = map;
	  }
	  
	@Override
	public int compare(Person p1, Person p2) {
		
		 return map.get(p1).compareTo(map.get(p2));
	}
	  
	}
