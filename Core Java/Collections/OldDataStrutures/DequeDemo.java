package OldDataStrutures;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DequeDemo 
{

	public static void main(String[] args)
	{
		
		Deque<String> dq=new ArrayDeque<String>();
		dq.add("India");
		dq.add("SriLanka");
		dq.add("USA");
		dq.addFirst("UK");
		dq.offer("Singapore");
		dq.offerFirst("Rusuaai");
		dq.offerLast("China");
		dq.addLast("Japan");
		
		System.out.println("Items in Deque                       "+dq);
		System.out.println("Deque size                           "+dq.size());
		System.out.println("removed item from deque by remove    "+dq.remove());
		System.out.println("Items in Deque                       "+dq);
		System.out.println("removed item from deque by poll      "+dq.poll());
		System.out.println("Items in Deque                       "+dq);
		System.out.println("removed item from deque by pollfirst "+dq.pollFirst());
		System.out.println("Items in Deque                       "+dq);
		System.out.println("removed item from deque by polllast  "+dq.pollLast());
		System.out.println("Items in Deque                       "+dq);
		System.out.println("Deque size after deletion            "+dq.size());
		System.out.println("Deque item in top by element         "+dq.element());
		System.out.println("Deque item in top by peek            "+dq.peek());
		System.out.println("Deque item in top by peekfirst       "+dq.peekFirst());
		System.out.println("Deque item in bottom by peeklast     "+dq.peekLast());
		
		Deque<String> dq2=new LinkedList<String>();
		dq2.add("India");
		dq2.add("SriLanka");
		dq2.add("USA");
		dq2.addFirst("UK");
		dq2.offer("Singapore");
		dq2.offerFirst("Rusuaai");
		dq2.offerLast("China");
		dq2.addLast("Japan");
		
		System.out.println("Items in Deque                       "+dq2);
		//same operations as above
		
	}
}
