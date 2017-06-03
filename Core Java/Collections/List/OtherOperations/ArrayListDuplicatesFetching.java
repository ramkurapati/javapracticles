package List.OtherOperations;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDuplicatesFetching {

	public static void main(String[] args) 
	{
		List<String> al1=new ArrayList<String>();
		al1.add("ram");
		al1.add("mohan");
		al1.add("raj");
		al1.add("manohar");
		al1.add("rahul");
		al1.add("mohan");
		al1.add("raj");
		al1.add("ram");
		System.out.println(al1);
		List<String> al2=new ArrayList<String>();
		al2.add("rahul");
		al2.add("hema");
		al2.add("ram");
		al2.add("manoj");
		al2.add("johny");
		al2.add("hema");
		al2.add("saroj");
		al2.add("manoj");
		System.out.println(al2);
		
		
			System.out.println("duplicates is there  "+al1.retainAll(al2));
		
		
	}

}
