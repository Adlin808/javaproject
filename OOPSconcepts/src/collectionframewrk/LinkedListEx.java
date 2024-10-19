package collectionframewrk;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class LinkedListEx {

	public static void main(String[] args) {
		LinkedList<Integer> ll=new LinkedList();
		ll.add(10);
		ll.addFirst(23);
		ll.add(6);
		ll.addLast(40);
		System.out.println("Element in Linked list:"+ll);
		System.out.println("Element in peek(Retrieve first):" +ll.peekFirst());
		System.out.println("Element in peek(Retrieve last)" +ll.peekLast());
		System.out.println("Element in linked List" +ll);
		System.out.println("Element in pollfirst(remove first):"+ll.pollFirst());
		System.out.println("Element in linked list:"+ll);
		System.out.println("Element in linked list using iterator:");
		//Traversing list
		
		Iterator<Integer> iter=ll.iterator();
		while(iter.hasNext()) {
			int i=iter.next();
			System.out.println(i);
		}
		System.out.println("Element in linked list :"+ll.getFirst());
		System.out.println("Element in peekfirst linked list:"+ll.peekFirst());
		ll.removeLast();
		System.out.println("Element in linked list :"+ll);
		
		//stack
		System.out.println("My stack");
		Stack<Integer> s=new Stack<>();
		System.out.println("Is empty or not:"+s.isEmpty());
		s.push(10);
		s.push(12);
		s.push(14);
		System.out.println("My element:"+s);
		s.pop();
		System.out.println("After pop my elements:"+s);
		System.out.println("Top of the element:"+s.peek());
		System.out.println(s.isEmpty());
		
		// TODO Auto-generated method stub

	}

}
