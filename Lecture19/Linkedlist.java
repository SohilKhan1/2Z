package Lecture19;

public class Linkedlist {
	public class Node {
		int data;
		Node next;

		public Node(int val) {
			data = val;
		}
	}

	Node head = null;
	Node tail = null;
	int size = 0;

	public void addFirst(int val) {
		if (head == null) {
			Node nn = new Node(val);
			head = nn;
			tail = nn;
		} else {
			Node nn = new Node(val);
			nn.next = head;
			head = nn;
		}
		size++;
	}

	public void AddLast(int val) {

		if (head == null) {
			addFirst(val);
		} else {
			Node nn = new Node(val);
			tail.next = nn;
			tail = nn;
		}
		size++;

	}

	public void addKth(int k, int val) {
		Node temp = getNode(k - 1);
		Node nn = new Node(val);
		Node temp2 = temp.next;
		temp.next = nn;
		nn.next = temp2;
		size++;
	}

	private Node getNode(int k) {
		Node temp = head;
		for (int i = 0; i < k; i++) {
			temp = temp.next;
		}
		return temp;
	}

	public void removeFirst() {
		if (head == null) {
			System.out.println("No data");
		} else {
			Node temp = head;
			head = head.next;
			temp.next = null;
		}
		size--;
	}

	public void removeLast() {
		Node temp = head;
		while (temp.next != tail) {
			temp = temp.next;
		}
		temp.next = null;
		tail = temp;
		size--;
	}

	public void removekth(int k) {
		Node temp = getNode(k - 1);
		Node temp2 = temp.next;
		temp.next = temp.next.next;
		temp2.next = null;
		size--;
	}

	public void getFist() {
		System.out.println(head.data);
	}

	public void getLast() {
		System.out.println(tail.data);
	}

	public void getkth(int k) {
		System.out.println(getNode(k).data);
	}

	public void print() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + "-->");
			temp = temp.next;
		}
		System.out.println("null");
	}

	public static void main(String[] args) {
		Linkedlist ll = new Linkedlist();
		ll.addFirst(10);
		ll.addFirst(20);
		ll.addFirst(30);
		ll.addFirst(40);
		ll.addFirst(50);
		ll.addFirst(60);
//		ll.print();
//		System.out.println(ll.size);
//		ll.removeFirst();
//		ll.print();
//		ll.removeLast();
//		ll.print();
//		ll.getFist();
//		ll.getLast();
		ll.print();
		ll.addKth(3, 100);
		ll.print();
		ll.removekth(3);
		ll.print();
		ll.getkth(3);

	}

}
