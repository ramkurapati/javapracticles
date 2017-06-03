package FecthingTechnologies;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo
{
	public static void main(String args[]) 
	{
		
		
		ArrayList al=new ArrayList();
		al.add("first");
		al.add("second");
		al.add("third");
		al.add("four");
		al.add("five");
		
		ListIterator lit= al.listIterator();
		Object obj=null;
		/*while(lit.hasNext())
		{
			//lit.add("sixth");
			obj= lit.next();
			//System.out.println(obj);
			System.out.println(al);
		}
		System.out.println(obj);*/
		System.out.println("***************************");
		while(lit.hasPrevious())
		{
			//lit.add("sixth");
			 obj= lit.previous();
			System.out.println(obj);
		}	
	}
	      
	      
}
