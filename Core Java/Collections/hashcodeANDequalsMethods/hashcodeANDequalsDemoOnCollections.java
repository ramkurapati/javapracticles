package hashcodeANDequalsMethods;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class hashcodeANDequalsDemoOnCollections 
{
	public static void main(String[] args)
	{
		Animal animal1=new Animal();
		animal1.setName("Tiger");
		animal1.setType("White");
		animal1.setAge(25);
		
		Animal animal2=new Animal();
		animal2.setName("Tiger");
		animal2.setType("White");
		animal2.setAge(25);
		
		//System.out.println(animal1);
		//System.out.println(" "+animal1.equals(animal2));
		
		/*List<Animal> list=new ArrayList<Animal>();
		list.add(animal1);
		list.add(animal2);
		System.out.println(list);*/
		
		
	/*	Set<Animal> set=new HashSet<Animal>();
		set.add(animal1);
		set.add(animal2);
		System.out.println(set);*/
		
		 
		/*Set<Animal> set2=new TreeSet<Animal>();
		set2.add(animal1);
		set2.add(animal2);
		System.out.println(set2);*/
		
		/*HashMap<Animal,Integer> hm=new HashMap<Animal,Integer>();	
		hm.put(animal1,123324);
		hm.put(animal2,23456);
		System.out.println(hm);*/
		
		Map<Integer,Animal> hm2=new TreeMap<Integer,Animal>();	
		hm2.put(1,animal1);
		hm2.put(2,animal2);
		System.out.println(hm2);
		
		/*Map<Animal,Integer> hm3=new TreeMap<Animal,Integer>();
		hm3.put(animal1,1);
		hm3.put(animal2,2);
		System.out.println(hm3);*/
		
	}
}
