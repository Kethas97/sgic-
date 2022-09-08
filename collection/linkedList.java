package collection;

import java.util.LinkedList;

public class linkedList {

	public static void main(String[] args) {
		
		LinkedList ll=new LinkedList();
		ll.add(5);
		ll.add(154);
		ll.add('d');
		ll.add("str");
		ll.add(7.125);
		
		
		System.out.println(ll);
		
		ll.addFirst("ajith");
		System.out.println(ll);
		
		ll.addLast("sk");
		System.out.println(ll);
		
		ll.removeFirst();
		System.out.println(ll);
		
		ll.removeLast();
		System.out.println(ll);
		
		
		System.out.println(ll.getFirst());
		
		
		System.out.println(ll.getLast());
		
		
		System.out.println(ll.get(2));
		
		System.out.println(ll);
		System.out.println(ll.poll());
		System.out.println(ll);
		
		System.out.println(ll.offer(24875621));
		System.out.println(ll);
		
		System.out.println(ll.offerFirst("wqdcCDC"));
		System.out.println(ll);
		
	}

}
