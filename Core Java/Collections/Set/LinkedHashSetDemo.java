package Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo
{
	public static void main(String[] args)
	{
		HashSet<String> hs=new LinkedHashSet<String>();
		
		hs.add("ramu");
		hs.add("mohan");
		hs.add("nandu");
		hs.add("kuldeep");
		hs.add("danush");
		hs.add("babi");
		hs.add("raja");
		hs.add("sudheer");
		hs.add("mohan");
		hs.add(null);
		//output comes given order
		Iterator<String> it=hs.iterator();
		while(it.hasNext())
		{
			System.out.println("Elements in set  :"+it.next());
		}
		System.out.println("Elements in set"+hs);
		
	}
}
