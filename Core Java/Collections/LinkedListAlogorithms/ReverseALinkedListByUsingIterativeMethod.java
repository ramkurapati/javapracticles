package LinkedListAlogorithms;

public class ReverseALinkedListByUsingIterativeMethod {

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

	public void printList(Node head) {
		Node temp = head;
		while (temp != null) {
			System.out.format("%d ", temp.value);
			temp = temp.next;
		}
		System.out.println();
	}

	// This function will reverse the linkedlist
		public  Node reverseLinkedList(Node currentNode)  
		 {  
		// For first node, previousNode will be null  
		Node previousNode=null;  
		  Node nextNode;  
		  while(currentNode!=null)  
		  {  
		   nextNode=currentNode.next;  
		  // reversing the link  
		   currentNode.next=previousNode;  
		  // moving currentNode and previousNode by 1 node  
		   previousNode=currentNode;  
		   currentNode=nextNode;  
		  }  
		  return previousNode;  
		 }  


	public static void main(String[] args) {
		ReverseALinkedListByUsingIterativeMethod fmv = new ReverseALinkedListByUsingIterativeMethod();
		// Creating a linked list
		Node head = new Node(5);
		fmv.addToTheLast(head);
		fmv.addToTheLast(new Node(6));
		fmv.addToTheLast(new Node(7));
		fmv.addToTheLast(new Node(1));
		fmv.addToTheLast(new Node(2));
		fmv.addToTheLast(new Node(4));
		fmv.addToTheLast(new Node(9));
		fmv.printList(head);
		// finding middle element
		Node reverseHead = fmv.reverseLinkedList(head);
		System.out.println("After reversing");  
		fmv.printList(reverseHead);


	}

}
