package collectionframewrk;

import java.util.Enumeration;
import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		
		//create a vector
		Vector<String> vector=new Vector<String>();
		//Add elements into vector
		vector.add("Adlin");
		vector.add("Daisy");
		vector.add("Cardii");
		vector.add("Preethi");
		vector.add("Ramya");
		vector.add("Gracy");
		System.out.println("List of elements in vector:"+vector);
		//get enumeration of vector elements
		
		Enumeration<String> en=vector.elements();
		/*Display vector elements using hasMoreElements()
		 * and nextElement() methods
		 */
		System.out.println("Vector elements are:");
		while(en.hasMoreElements())
			System.out.println(en.nextElement());
		

	}

}
