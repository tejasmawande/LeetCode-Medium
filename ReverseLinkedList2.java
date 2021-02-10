
public class ReverseLinkedList2 {

	public static class Node {

		int data;

		Node next;

		public Node getNext() {

			return next;

		}

		public void setNext(Node next) {

			this.next = next;

		}

		public int getData() {

			return data;

		}

		public void setData(int data) {

			this.data = data;

		}

		@Override

		public String toString() {

			return "Node [next=" + next + ", data=" + data + "]";

		}

	}

	public static Node push(Node head_ref, int new_data) {

		Node new_node = new Node();

		new_node.data = new_data;

		new_node.next = head_ref;

		head_ref = new_node;

		return head_ref;

	}

	public static void printList(Node node) {

		while (node != null) {

			System.out.println(node.data + "->");

			node = node.next;

		}

	}

	public static void main(String[] args) {

		System.out.println("In Main Method");

		Node head = null;

		head = push(head, 5);

		head = push(head, 4);

		head = push(head, 3);

		head = push(head, 2);

		head = push(head, 1);

		printList(head);

		int m = 2;
		int n = 4;
		Node updated_head = reverseList(head, m, n);

		printList(updated_head);

	}

public static Node reverseList(Node head, int m, int n) {
        
			
			Node prev = null;
			Node current = head;
			Node next = null;
			Node tailNode = null;

			
			while(m>1) {
				prev = current;
				current = current.next;
				n--;
				m--;
				
			}
			
			Node con = prev;
			tailNode = current;
			
			while(n>0) {
				
				next = current.next;
				current.next = prev;
				prev = current;
				current = next;
				n--;
			}
			
			if(con != null) {
				con.next = prev;
				
			}else {
				head = prev;
			}
			
			tailNode.next = current;
			
			return head;
}
}
