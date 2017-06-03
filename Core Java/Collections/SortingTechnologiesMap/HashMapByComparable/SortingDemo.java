package SortingTechnologiesMap.HashMapByComparable;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
public class SortingDemo
{
	public static void main(String[] args) 
	{
		 Map<String,Person> hm=new HashMap<String,Person>();
		 
		 Person p1=new Person("ram",27,"Banagalore",26920.70f);
		 Person p2=new Person("mohan",29,"Hyderabad",25000.00f);
		 Person p3=new Person("jhon",28,"Chennai",29920.86f);
		 
		 hm.put("SoftwareEngineer",p1);
		 hm.put("Teacher",p2);
		 hm.put("HR",p3);
		 
		/* System.out.println("------sort with keys ---------");
		 Map<String,Person> tm=new TreeMap<String,Person>(hm);
		 System.out.println(tm);*/
		 
		 System.out.println("------sort with values---------");
		 Map<String,Person> hashmap=new TreeMap<String,Person>(new ValueComparator(hm));
		 hashmap.putAll(hm);
		 System.out.println(hashmap);
		 
		 /*TreeMap<String,Person> tm2=new TreeMap<String,Person>();
		 tm2.put("SoftwareEngineer",p1);
		 tm2.put("Teacher",p2);
		 tm2.put("HR",p3);
		 
		 System.out.println(tm2);*/
		 
		 
		 
		 

	}

}
