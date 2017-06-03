package Set;

import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {
	
	public static void main(String[] args)
	{
		Set<String> hs=new HashSet<String>();
		
		hs.add("ramu");
		hs.add("mohan");
		hs.add(null);
		hs.add("nandu");
		hs.add("kuldeep");
		hs.add("danush");
		hs.add("babi");
		hs.add("raja");
		hs.add("sudheer");
		hs.add("mohan");
		hs.add(null);
		
		System.out.println(hs);
		
		hs.remove("mohan");
		
		System.out.println(hs);
		
		//output comes in its own order
		Iterator<String> it=hs.iterator();
		while(it.hasNext())
		{
			System.out.println("Elements in set  :"+it.next());
		}
		//System.out.println("Elements in set"+hs);
	
	}

}
