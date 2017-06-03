package SortingTechnologiesMap.HashMapByComparable;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class ValueComparator implements Comparator<String> 
{
	  Map<String,Person> map;
	 
	  public ValueComparator(Map<String, Person> hm)
	  {
	    this.map = hm;
	  }
	  
	public int compare(String s1, String s2) {
		
		 return map.get(s1).compareTo(map.get(s2));
	}
	  
	}
