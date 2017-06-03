package SortingTechnologiesMap;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

import SortingTechnologiesMap.TreeMapByComparable.Person;

public class ValueComparator implements Comparator<Integer> 
{
	 
	 Map<Integer, String> map;
	 
	  public ValueComparator(Map<Integer, String> treemap)
	  {
	    this.map = treemap;
	  }
	  
	  

	public int compare(Integer keyA, Integer keyB)
	  {
	
	    return map.get(keyA).compareTo(map.get(keyB));
	 
	  }
	  
	}
