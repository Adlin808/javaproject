package collectionframewrk;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetEx {
	//Null values not allowed---Duplication not allowed
	//print in ascending order(Default)

	public static  void main(String[] args) {
		TreeSet<String> ts=new TreeSet<>();
		ts.add("Adlin");
		ts.add("Abi");
		ts.add("Cardii");
		ts.add("Ramya");
		ts.add("Daisy");
		ts.add("Preethi");
		ts.add("abi");
		ts.add("Mirthu");
		System.out.println("Treeset:"+ts);
		ts.remove("Gracy");
		System.out.println("TreeSet after removal:"+ts);
		//To print Descending order
		TreeSet<String> tsdes=(TreeSet<String>)ts.descendingSet();
		System.out.println("Descending order:"+tsdes);
		System.out.println("Descending order using iterator:");
		Iterator<String> i1=ts.descendingIterator();
		while(i1.hasNext())
			System.out.print(i1.next()+" ");
		
		//System.out.println("Is the set empty:"+ts.isEmpty());
		

	}

}
