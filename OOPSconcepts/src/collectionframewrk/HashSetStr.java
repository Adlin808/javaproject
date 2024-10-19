package collectionframewrk;

import java.util.HashSet;

public class HashSetStr {

	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<>();
		hs.add("Adlin");
		hs.add("Gracy");
		hs.add("Cardii");
		hs.add(null);
		hs.add("Daisy");
		hs.add("Preethi");
		hs.add("Ramya");
		hs.add("Mirthu");
		hs.add(null);
		//HashSet follows random order-no duplication
		System.out.println("Hashset:"+hs);
		hs.remove("Gracy");
		System.out.println("HashSet after removal:"+hs);
		System.out.println("Is the set empty:"+hs.isEmpty());
		

	}

}
