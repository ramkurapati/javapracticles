package SortingTechnologiesMap.TreeMapByComparable;

import java.util.TreeMap;


public class SortingDemo
{
	public static void main(String[] args) 
	{
		 TreeMap<Person,String> tm=new TreeMap<Person,String>();
		 
		 Person p1=new Person("ram",27,"Banagalore",26920.70f);
		 Person p2=new Person("mohan",29,"Hyderabad",25000.00f);
		 Person p3=new Person("jhon",25,"Chennai",29920.86f);
		 
		 tm.put(p1, "SoftwareEngineer");
		 tm.put(p2, "Teacher");
		 tm.put(p3, "HR");
		 
		/* System.out.println("------sort with keys default---------");
		 System.out.println(tm);*/
		 
		 System.out.println("------sort with values---------");
		 TreeMap<Person,String> treemap=new TreeMap<Person, String>(new ValueComparator(tm));
		 treemap.putAll(tm);
		 System.out.println(treemap);
		 
		 
		 
		 
		 

	}

}
