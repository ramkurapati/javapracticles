package LinkedListAlogorithms;

public class ReverseALinkedListByUsingRecursiveMethod {

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
	public Node reverseLinkedList(Node node) {
		
		if (node == null || node.next == null) {
			return node;
		}

		Node remaining = reverseLinkedList(node.next);
		node.next.next = node;
		node.next = null;
		return remaining;

	}

	public static void main(String[] args) {
		ReverseALinkedListByUsingRecursiveMethod fmv = new ReverseALinkedListByUsingRecursiveMethod();
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
