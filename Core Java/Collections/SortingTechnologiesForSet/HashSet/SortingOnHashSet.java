package SortingTechnologiesForSet.HashSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


public class SortingOnHashSet
{
	public static void main(String[] args)
	{
		
		
		HashSet<String> hs=new HashSet<String>();
		hs.add("ramu");
		hs.add("mohan");
		hs.add("nandu");
		hs.add("kuldeep");
		hs.add("danush");
		hs.add("babi");
		hs.add("raja");
		hs.add("sudheer");
		
		System.out.println("HashSet Before Sorted           "+hs);
		//HashSet itself cannot be sorted,that why we change it to our like forms(like array,TreeSet,ArrayList(not good))
		String[] arr=new String[hs.size()];
		hs.toArray(arr);
		Arrays.sort(arr);
		System.out.print("HashSet sorting done by Arrays");
		for(String str:arr)
		   System.out.print("  "+str);
		
		System.out.println("  ");
		Set<String> htset=new TreeSet<>(hs);
		//htset.addAll(hs);
		System.out.println("HashSet sorting done by TreeSet "+htset);
		
		List<String> hslist=new ArrayList<>();
		hslist.addAll(hs);
		Collections.sort(hslist);
		System.out.println("HashSet sorting done by ArrayList "+hslist);

	}

}
