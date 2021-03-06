public class LinkedList {
	
	class Node {
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
		}
	}
	
	Node head;
	
	public void append(int data) {
		if (head == null) {
			head = new Node(data);
			return;
		}
		Node current = head;
		while(current.next != null) {
			current = current.next;
		}
		current.next = new Node(data);
	}
	
	public void prepend(int data) {
		Node newHead = new Node(data);
		newHead.next = head;
		head = newHead;
	}
	
	public void deleteWithValue(int data) {
		if (head == null) return;
		
		Node current = head;
		while(current.next != null) {
			if (current.next.data == data) {
				current.next = current.next.next;
				return;
			}
			current = current.next;
		}
	}
	
	public void printList() {
		if(this.head != null) {
			System.out.println(this.head.data);
			Node nextToPrint = this.head.next;
			while(nextToPrint != null) {
				System.out.println(nextToPrint.data);
				nextToPrint = nextToPrint.next;
			}
		} else {
			System.out.println("Linked list is empty.");
		}
	}
	
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.append(1);
		list.append(2);
		list.append(3);
		list.append(4);
		list.printList();
		list.prepend(0);
		System.out.println("After prepend 0");
		list.printList();
		list.deleteWithValue(3);
		System.out.println("After delete 3");
		list.printList();
	}

}
