package OldDataStrutures;

import java.util.Iterator;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] arrays)
	{
		
		Stack<String> stack=new Stack<String>();
		stack.push("Vijaywada");
		stack.push("Chittoor");
		stack.push("Kurnool");
		stack.push("Guntur");
		stack.push("Anantapur");
		stack.push("Kadapa");
		stack.push("Vizag");
		stack.push("Nellore");
		
		System.out.println("Items in stack "+stack);
		System.out.println("Stack size "+stack.size());
	    System.out.println("Item deleted from stack "+ stack.pop());
	    System.out.println("Items in Stack  after deletion");
		int i=stack.size()-1;
		while(i>-1)
		{
		   System.out.println("["+i+"]="+stack.get(i));	
		   i--;
		}
		System.out.println("Stack size "+stack.size());
		System.out.println("Stack peek "+stack.peek());
		System.out.println("Stack search "+stack.search("Guntur"));

		Iterator<String> it=stack.iterator();
		while(it.hasNext())
		{
			System.out.println(" data in arraylist iterator   "+it.next());
		}
		
	}

}
