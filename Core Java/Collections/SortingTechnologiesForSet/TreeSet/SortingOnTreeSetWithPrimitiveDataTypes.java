package SortingTechnologiesForSet.TreeSet;

import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortingOnTreeSetWithPrimitiveDataTypes 
{

	public static void main(String[] args)
	{
		/*
		Set<Integer> tset2=new TreeSet<Integer>();
		     tset2.add(12);
	        // tset2.add(null); Null pointer exception
	         tset2.add(90);
	         tset2.add(58);
	         tset2.add(191);
	         tset2.add(0);
	         tset2.add(41);
	         tset2.add(191);
	         tset2.add(7);
	         //TreeSet itself sorted and we don't require to sort it
	         
	         System.out.println("TreeSet implementation   "+tset2);
		*/
	      SortedSet<Integer> sset = new TreeSet<>(); 
	         sset.add(12);
	        // sset.add(null); Null pointer exception
	         sset.add(90);
	         sset.add(58);
	         sset.add(191);
	         sset.add(0);
	         sset.add(41);
	         sset.add(191);
	         sset.add(7);
	         
	         System.out.println("SortedSet implementation "+sset);
	         System.out.println("SortedSet first element  "+ sset.first());
	         System.out.println("SortedSet last element   "+ sset.last());
	         System.out.println("SortedSet by headset upto element"+ sset.headSet(42));
	         System.out.println("SortedSet by tailset from element"+ sset.tailSet(90));
	         System.out.println("SortedSet by subset from to  elements"+ sset.subSet(12,59));
	         
		Comparator<Integer> comparator=Collections.reverseOrder();//for descending order
		Set<Integer> tset=new TreeSet<Integer>(Collections.reverseOrder());
           tset.add(12);
          // tset.add(null); Null pointer exception
           tset.add(90);
           tset.add(58);
           tset.add(191);
           tset.add(0);
           tset.add(41);
           tset.add(191);
           tset.add(7);
         
        // Collections.sort(tset);this is not possible in case of Set ,it is possible for List only
          System.out.println(""+tset);
          
          
          
	}

}
