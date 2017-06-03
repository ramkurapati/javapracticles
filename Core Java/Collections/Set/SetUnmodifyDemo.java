package Set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SetUnmodifyDemo {
	public static void main(String arg[])
	{
		Set set= new HashSet();
		set.add(1);
		set.add(2);
		System.out.println(set);
		Set set2= Collections.unmodifiableSet(set);
	    set2.add(3);
	    
		System.out.println(set2);
	}

}
