package collectionframewrk;

import java.util.HashSet;

public class HashSetEx {

	public static void main(String[] args) {
		HashSet<Integer> hs=new HashSet<>();
		hs.add(10);
		hs.add(35);
		hs.add(23);
		hs.add(null);
		hs.add(87);
		hs.add(56);
		hs.add(20);
		hs.add(23);
		hs.add(null);
		//HashSet follows random order-no duplication
		System.out.println("Hashset:"+hs);
		hs.remove(23);
		System.out.println("HashSet:"+hs);
		System.out.println(hs.isEmpty());
		
		
		

	}

}
