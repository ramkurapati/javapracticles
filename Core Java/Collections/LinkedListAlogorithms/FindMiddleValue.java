package LinkedListAlogorithms;

public class FindMiddleValue {

	     private Node head;  
	  
		 private static class Node {  
		  private int value;  
		  private Node next;  
		  
		  Node(int value) {  
		   this.value = value;  
		  
		  }  
		 }  
		  
		 public void addToTheLast(Node node) {  
		  
		  if (head == null) {  
		   head = node;  
		  } else {  
		   Node temp = head;  
		   while (temp.next != null)  
		    temp = temp.next;  
		    temp.next = node;  
		  }  
		 }  
		  
		  
		 public void printList() {  
		  Node temp = head;  
		  while (temp != null) {  
		   System.out.format("%d ", temp.value);  
		   temp = temp.next;  
		  }  
		  System.out.println();  
		 }  
		  
	// This function will find middle element in linkedlist  
	   public Node findMiddleNode(Node head)  
	   {  
		  // step 1  
		  Node firstPtr=head;  
		  Node secondPtr=head;  
		      
		  int i=0;  
		  while(firstPtr.next != null){  
		     
		   if(i==0){  
			   firstPtr=firstPtr.next;  
		    i=1;  
		   }  
		   else if(i==1){  
			   firstPtr=firstPtr.next;  
		    secondPtr=secondPtr.next;  
		    i=0;  
		      
		   }  
		  }  
		  
		  return secondPtr;  
		  
		 }  

	
	public static void main(String[] args) {
		FindMiddleValue fmv = new FindMiddleValue();  
	  // Creating a linked list  
		  Node head=new Node(5);  
		  fmv.addToTheLast(head);  
		  fmv.addToTheLast(new Node(6));  
		  fmv.addToTheLast(new Node(7));  
		  fmv.addToTheLast(new Node(1));  
		  fmv.addToTheLast(new Node(2));  
		  fmv.addToTheLast(new Node(4));
		  fmv.addToTheLast(new Node(9));
		  fmv.printList();  
	 // finding middle element  
		  Node middle= fmv.findMiddleNode(head);  
		  System.out.println("Middle node will be: "+ middle.value);  
		  


	}

}
