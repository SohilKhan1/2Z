package Lecture18;
import java.util.LinkedList;

public class Linked_List {
	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(50);
		System.out.println(ll);
		ll.remove();
		System.out.println(ll);
		ll.remove(3);
		System.out.println(ll);
		System.out.println(ll.size());
		ll.addFirst(100);
		ll.addLast(300);
		System.out.println(ll);
		ll.add(2, 500);
		System.out.println(ll);
		ll.removeLast();
		System.out.println(ll);
		ll.remove(2);
		System.out.println(ll);
		System.out.println(ll.contains(400));
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		System.out.println(ll.get(2));


	}

}
