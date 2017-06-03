package List.MainOperations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class ArrayListDemo {

	public static void main(String[] args)
	{
		
      List<String> states=new ArrayList<String>();
      
      states.add("AndhraPradesh");
      states.add("Bihar");
      states.add("Karnataka");
      states.add("Rajastan");
      states.add("Gujarat");
      states.add("Maharashtra");
      states.add("Punjab");
      states.add("Tamilnadu");
      states.add("Kerala");
      states.add("Goa");
      states.add("Telangana");
      
      System.out.println(states);
      System.out.println("--------------------------------");
     /* List<String> al=new Vector<String>();
      al.addAll(states);
      System.out.println("States in vector                                "+al);
      al.addAll(3,states);
      System.out.println("States in vector after adding states at index 3 "+al);*/
      
      
      System.out.println("State at index 10 "+states.get(10));
      System.out.println("Punjab at "+states.indexOf("Punjab"));
      System.out.println(""+states.lastIndexOf("AndhraPradesh"));
      System.out.println("Size "+states.size());
     // System.out.println("Removed state is "+states.remove(5));
     //  System.out.println("After removing remaining states list       "+states);
       //System.out.println("set a state at index 5 by replace of "+states.set(10,"Assam"));
     //System.out.println("After setting state at index 5 states list "+states);
    /*states.add(6, "WB");
      System.out.println("adding a state at index 6                  "+states);
      System.out.println("--------->>>>>>>>>> ");
    Collections.sort(states);
    System.out.println("After sorting ");
    System.out.println(states);*/
     /* Iterator<String> it=states.iterator();
      while(it.hasNext())
      {
    	  System.out.println(it.next());  
      }
      System.out.println("--------- >>>>>>>>>>>>>>. ");*/
      
      /*ListIterator<String> lit1=states.listIterator();
      while(lit1.hasNext())
      {
     	
     	 System.out.println(lit1.nextIndex()+"  "+lit1.next());
      }
      System.out.println("---------  ");*/
     ListIterator<String> lit2=states.listIterator(states.size());
     while(lit2.hasPrevious())
     {
    	 System.out.println(lit2.nextIndex()+"  "+lit2.previous());
     }
     System.out.println("--------->>>>>>>>>>>>>>>>>>>  ");
     /*List<String> sublist=states.subList(0, 6);
     for(String str:sublist)
     {
    	 System.out.println(str);
     }*/
     
	}

}
