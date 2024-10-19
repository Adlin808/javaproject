package collectionframewrk;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListEx {
	//Arraylist follows insertion order-Duplication allowed

	public static void main(String[] args) {
		ArrayList<Integer> alist=new ArrayList<>();
		alist.add(10);
		alist.add(3);
		alist.add(5);
		alist.add(1);
		alist.add(null);
		alist.add(10);
		alist.add(70);
		alist.add(15);
		alist.add(null);
		System.out.println("My arraylist:"+alist);
		System.out.println("My array list size:"+alist.size());
		System.out.println("My arraylist get:"+alist.get(3));
		alist.add(5,20);
		System.out.println("My arraylist:"+alist);
		alist.remove(4);
		System.out.println("My arraylist:"+alist);
		alist.set(4,100);
		System.out.println("My updated arraylist:"+alist);
		ArrayList<Integer> alist1=new ArrayList<>();
		alist1.add(90);
		System.out.println("My arraylist:"+alist1);
		alist1.addAll(alist);
		System.out.println("My updated arraylist:"+alist1);
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(10.0);
		al.add('a');
		al.add("fhhjkk");
		System.out.println("My Generic array list:"+al);
		System.out.println("contains:"+al.contains(101));
		System.out.println("Enhanced For Loop");
		for(Integer all:alist) {
			System.out.print(all+"----");
		}
		System.out.println("Using List Iterator");
		ListIterator<Integer> lt=alist.listIterator();
		while(lt.hasNext()) {
			System.out.print(lt.next()+" ");
		}
		System.out.println("Using Iterator");
		Iterator<Integer> lt1=alist.iterator();
		while(lt1.hasNext()) {
			System.out.print(lt1.next()+" ");
		}
		

	}

}