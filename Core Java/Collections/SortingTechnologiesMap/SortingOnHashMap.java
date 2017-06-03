package SortingTechnologiesMap;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortingOnHashMap 
{
	public static void main(String[] args)
	{
		Map<Integer,String> hashmap=new HashMap<>();
		hashmap.put(100101, "Hemanth");
		hashmap.put(100248, "Raja");
		hashmap.put(100205, "Chandra");
		hashmap.put(100944, "Fathima");
		hashmap.put(100749, "Rabert");
		hashmap.put(100443, "Rahul");
		
		System.out.println("before sort"+hashmap);
		 
        System.out.println("HashMap sorted with keys by TreeMap");
		  Map<Integer,String> treemap=new TreeMap<Integer,String>(hashmap);
		  //TreeMap default sorted by keys
		  System.out.println("           "+treemap);
		
		System.out.println("HashMap sorted with values using TreeMap by comparator");
		 Map<Integer,String> treemap2=new TreeMap<Integer, String>(new ValueComparator(hashmap));
		 treemap2.putAll(treemap);
		 System.out.println("           "+treemap2);
	      
	}
	
	
	
}
