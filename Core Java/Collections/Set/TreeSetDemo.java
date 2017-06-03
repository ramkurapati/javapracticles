package Set;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {
	
	public static void main(String[] args)
	{
		TreeSet<String> ts=new TreeSet<String>();
		
		ts.add("ramu");
		ts.add("mohan");
		ts.add("nandu");
		ts.add("kuldeep");
		ts.add("danush");
		ts.add("babi");
		ts.add("raja");
		ts.add("sudheer");
		ts.add("mohan");
		//ts.add(null); //Null pointer Exception occurred 
		//output comes in sorted order
		Iterator<String> it=ts.iterator();
		while(it.hasNext())
		{
			System.out.println("Elements in set  :"+it.next());
		}
		System.out.println("Elements in set"+ts);
	}

}
