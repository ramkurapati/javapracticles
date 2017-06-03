package LinkedListAlogorithms;

public class StackImplByLL {
	private Node head; // first Node
	
	private class Node {
		Node next;
		int value;
	}
	
	public StackImplByLL(){
		head=null;
	}
	
	public void push(int value){
		Node oldhead=head;
		head=new Node();
		head.value=value;
		head.next=oldhead;
		
	}

	public int pop(){
		if(head ==null){
			throw new StackException();
		}
		int value=head.value;
		head=head.next;
		return value;
	}
	
	public  void printLL(Node head) {
		 Node temp = head;
		 while (temp != null) {
		 System.out.format("%d ", temp.value);
		 temp = temp.next;
		 }
		 System.out.println();
		 }
	
  class StackException extends RuntimeException{
		
	private static final long serialVersionUID = 1L;

		public StackException(){
			super();
		}
	}
	public static void main(String[] args) {
		
		StackImplByLL stack=new StackImplByLL();
		stack.push(24);
		stack.push(23);
		stack.push(22);
		stack.push(25);
		stack.push(29);
		stack.push(27);
		System.out.println("Element removed from LinkedList: "+stack.pop());
		 System.out.println("Element removed from LinkedList: "+stack.pop());
		 stack.push(26);
		 System.out.println("Element removed from LinkedList: "+stack.pop());
		 stack.printLL(stack.head);
	}
	
	

}
