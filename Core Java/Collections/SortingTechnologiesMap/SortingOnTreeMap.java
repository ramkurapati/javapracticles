package SortingTechnologiesMap;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class SortingOnTreeMap 
{
	public static void main(String[] args)
	{
		Map<Integer,String> treemap=new TreeMap<>();
		treemap.put(100101, "Hemanth");
		treemap.put(100248, "Raja");
		treemap.put(100205, "Chandra");
		treemap.put(100944, "Fathima");
		treemap.put(100749, "Rabert");
		treemap.put(100443, "Rahul");
		
		//TreeSet default sorted by keys
        System.out.println("TreeMap sorted with keys by default");
		  System.out.println("           "+treemap);
		
		System.out.println("TreeMap sorted with values by comparator");
		 Map<Integer,String> treemap2=new TreeMap<Integer, String>(new ValueComparator(treemap));
		 treemap2.putAll(treemap);
		System.out.println("           "+treemap2);
	      
	}
	
	
	
}
