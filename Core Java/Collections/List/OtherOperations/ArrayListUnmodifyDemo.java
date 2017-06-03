package List.OtherOperations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListUnmodifyDemo 
{
	public static void main(String arg[])
	{
		ArrayList al= new ArrayList();
		al.add(1);
		al.add(2);
		System.out.println(al);
		List al2= Collections.unmodifiableList(al);
		
		al2.add(3);
		System.out.println(al2);
	}

}
