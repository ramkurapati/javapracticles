package OldDataStrutures;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;


public class QueueDemo {

	public static void main(String[] args)
	{
		Queue<String> qu=new PriorityQueue<String>();
		       qu.offer("Vijaywada");
		       qu.offer("Chittoor");
		       qu.offer("Kurnool");
		       qu.offer("Guntur");
		       qu.offer("Anantapur");
		       qu.offer("Kadapa");
		       qu.offer("Vizag");
		       qu.offer("Nellore");
	      
		System.out.println("Items in Queue "+qu);
		System.out.println("Queue size" +qu.size());
		System.out.println("Item in queue at peek  "+qu.peek());
		System.out.println("Item in queue at first "+qu.element());
		System.out.println("Item in queue after poll  "+qu.poll());
		System.out.println("Items in Queue "+qu);
		System.out.println("Queue size after poll "+qu.size());
		System.out.println("Item in queue after remove  "+qu.remove());
		System.out.println("Items in Queue "+qu);
		Iterator<String> it=qu.iterator();
		while(it.hasNext())
		{
			System.out.println("Items in Queue iterator   "+it.next());
		}
		System.out.println("---------Queue implement by LinkedList---------------");
		Queue<String> qu2=new LinkedList<String>();
	       qu2.offer("Vijaywada");
	       qu2.offer("Chittoor");
	       qu2.offer("Kurnool");
	       qu2.offer("Guntur");
	       qu2.offer("Anantapur");
	       qu2.offer("Kadapa");
	       qu2.offer("Vizag");
	       qu2.offer("Nellore");
	       
	     System.out.println("Items in Queue "+qu2);
	     System.out.println("Queue size     " +qu2.size());
			System.out.println("Item in queue at peek  "+qu2.peek());
			System.out.println("Item in queue at first "+qu2.element());
			System.out.println("Item in queue after poll  "+qu2.poll());
			System.out.println("Items in Queue "+qu2);
			System.out.println("Queue size after poll "+qu2.size());
			System.out.println("Item in queue after remove  "+qu2.remove());
			System.out.println("Items in Queue "+qu2);
			Iterator<String> it2=qu2.iterator();
			while(it2.hasNext())
			{
				System.out.println("Items in Queue iterator   "+it2.next());
			}
		
	}
	
}
