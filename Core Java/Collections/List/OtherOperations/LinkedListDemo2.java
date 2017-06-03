package List.OtherOperations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class LinkedListDemo2 {

	
	public static void main(String[] arrays)
	{
		LinkedList ll=new LinkedList();
		Scanner s=new Scanner(System.in);
		String No;
		String data="";
		
		while(true)
		{
			System.out.println("Enter your data ,other wise press 'no' ");
			data=s.next();
			if(!data.equalsIgnoreCase("no"))
				ll.add(data);
			else
				break;
		}
		System.out.println("ArrayList size"+ll.size());
		System.out.println(" data in arraylist "+ll);
		int i=0;
		while(i<ll.size())
		{
			System.out.println("al["+i+"]="+ll.get(i));	
			i++;
		}
		System.out.println("Enter item for remove from data");
		No=s.next();
		if(ll.contains(No))
		{
			ll.remove(No);
			System.out.println("Element deleted from data");
		}
		else
			System.out.println("Enter item for deletion, not found in data");
		
		System.out.println("ArrayList size"+ll.size());
		System.out.println(" data in arraylist  after deletion");
		
		for(i=0;i<ll.size();i++)
		{
			System.out.println("al["+i+"]="+ll.get(i));		
		}
		Iterator it=ll.iterator();
		while(it.hasNext())
		{
			System.out.println(" data in arraylist iterator   "+it.next());
		}
		ListIterator lit=ll.listIterator();
		while(lit.hasNext())
		{
			System.out.println(" data in arraylist ListIteartor    "+lit.next());
		}
		Enumeration e=Collections.enumeration(ll);
		while(e.hasMoreElements())
		{
			System.out.println(" data in arraylist Enumeration    "+e.nextElement());
		}
		for(Object o:ll)
		{
			System.out.println(" data in arraylist for each loop   "+o);
		}
	}

}
