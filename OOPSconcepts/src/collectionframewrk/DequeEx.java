package collectionframewrk;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeEx {

	public static void main(String[] args) {
		Deque<String> dq=new ArrayDeque<String>();
		dq.offer("Adlin");
		dq.offer("Gracy");
		dq.offer("Cardii");
		dq.offer("Preethi");
		dq.offer("Princy");
		dq.offer("Praisy");
		System.out.println(dq);
		System.out.println("Get first:"+dq.getFirst());
		System.out.println(dq);
		System.out.println("Remove first:"+dq.removeFirst());
		System.out.println(dq);
		dq.addFirst("Ramya");
		System.out.println(dq);
		System.out.println("Get last:"+dq.getLast());
		System.out.println(dq);
		System.out.println("Remove last:"+dq.removeLast());
		System.out.println(dq);
		dq.add("Daisy");
		System.out.println(dq);
		
		
		// TODO Auto-generated method stub

	}

}
