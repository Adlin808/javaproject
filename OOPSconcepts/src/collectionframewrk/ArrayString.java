package collectionframewrk;

import java.util.ArrayList;

public class ArrayString {

	public static void main(String[] args) {
		
			ArrayList<String> alist=new ArrayList<>();
			alist.add("Adlin");
			alist.add("Daisy");
			alist.add("Cardii");
			alist.add("Mirthu");
			alist.add(null);
			alist.add("Preethi");
			alist.add("Ebi");
			alist.add("Jeba");
			alist.add(null);
			System.out.println("My arraylist:"+alist);
			System.out.println("My array list size:"+alist.size());
			System.out.println("My arraylist get:"+alist.get(3));
			alist.add(5,"Ramya");
			System.out.println("My arraylist:"+alist);
			alist.remove(4);
			System.out.println("My arraylist:"+alist);
			alist.set(4,"Gracy");
			System.out.println("My updated arraylist:"+alist);
			ArrayList<String> alist1=new ArrayList<>();
			alist1.add("Prassanna");
			System.out.println("My arraylist:"+alist1);
			alist1.addAll(alist);
			System.out.println("My updated arraylist:"+alist1);
			
                                                                                                                                                                                                                    
		}

}
