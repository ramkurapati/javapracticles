package List.OtherOperations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class ArrayListDemo2 {
	public static void main(String[] arrays)
	{
		//ArrayList al=new ArrayList();
		List al=new ArrayList();
		Scanner s=new Scanner(System.in);
		String No;
		String data="";
		
		while(true)
		{
			System.out.println("Enter your data ,other wise press 'no' ");
			data=s.next();
			if(!data.equalsIgnoreCase("no"))
		    	al.add(data);
			else
				break;
		}
		System.out.println("ArrayList size"+al.size());
		System.out.println(" data in arraylist "+al);
		int i=0;
		while(i<al.size())
		{
			System.out.println("al["+i+"]="+al.get(i));	
			i++;
		}
		System.out.println("Enter item for remove from data");
		No=s.next();
		if(al.contains(No))
		{
			al.remove(No);
			System.out.println("Element deleted from data");
		}
		else
			System.out.println("Enter item for deletion, not found in data");
		
		System.out.println("ArrayList size"+al.size());
		System.out.println(" data in arraylist  after deletion");
		
		for(i=0;i<al.size();i++)
		{
			System.out.println("al["+i+"]="+al.get(i));		
		}
		Iterator it=al.iterator();
		while(it.hasNext())
		{
			System.out.println(" data in arraylist iterator   "+it.next());
		}
		ListIterator lit=al.listIterator();
		while(lit.hasNext())
		{
			System.out.println(" data in arraylist ListIteartor    "+lit.next());
		}
		Enumeration e=Collections.enumeration(al);
	
		while(e.hasMoreElements())
		{
			System.out.println(" data in arraylist Enumeration    "+e.nextElement());
		}
		for(Object o:al)
		{
			System.out.println(" data in arraylist for each loop   "+o);
		}
	}

}
