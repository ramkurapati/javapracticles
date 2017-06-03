package List.MainOperations;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class LinkedListDemo {

	public static void main(String[] args)
	{
	
		/*List<String> states=new LinkedList<String>();
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
	      
	     
	      System.out.println("States in LinkedList          "+states);*/
	     /* Collections.sort(states);
	      System.out.println("Sorted States in LinkedList "+states);*/
	      //Like this all operations are same with List<String> states=new LinkedList<String>() is equal List<String> states=new ArrayList<String>();
	      
	     /* LinkedList<String> LL=new LinkedList<String>();
	      //By doing this we implement some more operations
	      LL.add("vijaywada");
	      LL.add("bengalure");
	      LL.add("Trivendram");
	      LL.addFirst("chennai");
	      LL.add("kolkata");
	      LL.add("bombay");
	      LL.addLast("Hyderabad");
	      LL.add("gandhinagar");
	      LL.addFirst("panaji");
	      System.out.println("------------------LinkedList Operations------------------");
	      System.out.println("capitals in  LinkedList           "+LL);
	      System.out.println("capital  in  LinkedList  first    "+LL.getFirst());
	      System.out.println("capital  in  LinkedList  last     "+LL.getLast());
	      System.out.println("first item removed                "+LL.removeFirst());
	      System.out.println("capitals in  LinkedList           "+LL);
	      System.out.println("Last  item removed                "+LL.removeLast());
	      System.out.println("capitals in  LinkedList           "+LL); */
	      
	      //we implement StacK  
	     /* LinkedList<String> stack=new LinkedList<String>();
	      stack.addFirst("vijaywada");
	      stack.addFirst("bengalure");
	      stack.addFirst("panaji");
	      stack.addFirst("Trivendram");
	      stack.addFirst("chennai");
	      stack.addFirst("kolkata");
	      stack.addFirst("bombay");
	      stack.addFirst("Hyderabad");
	      stack.addFirst("gandhinagar");
	      System.out.println("------------------Stack Operations------------------");
	      System.out.println("capitals in Stack             "+stack);
	      System.out.println("Last in first out             "+stack.removeFirst());
	      System.out.println("capitals in Stack             "+stack);*/
	      //we implement  Queue 
	     /* LinkedList<String> queue=new LinkedList<String>();
	      queue.addLast("vijaywada");
	      queue.addLast("bengalure");
	      queue.addLast("panaji");
	      queue.addLast("Trivendram");
	      queue.addLast("chennai");
	      queue.addLast("kolkata");
	      queue.addLast("bombay");
	      queue.addLast("Hyderabad");
	      queue.addLast("gandhinagar");
	      System.out.println("------------------Queue Operations------------------");
	      System.out.println("capitals in Queue             "+queue);
	      System.out.println("first in first out            "+queue.removeFirst());*/
	         
	      LinkedList<String> bag=new LinkedList<String>();
	      bag.add("redball");
	      bag.add("greenball");
	      bag.add("redball");
	      bag.add("whiteball");
	      bag.add("redball");
	      bag.add("greenball");
	      
	      System.out.println(""+bag);
	      System.out.println("redball count : " + Collections.frequency(bag, "redball"));
	      Set<String> uniqueSet = new HashSet<String>(bag);
	  	   for (String ball : uniqueSet) 
	  	   {
	  		System.out.println(ball + ": " + Collections.frequency(bag, ball));
	  	    }
	      
	}

}
