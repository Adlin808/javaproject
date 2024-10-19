package exceptionex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CompileTimeEx {

	public static void main(String[] args) throws IOException {
		/*try {
			Class.forName("basic.Demo");
			System.out.println("Class found");}
		catch(ClassNotFoundException e) {
			System.out.println(e.getMessage());
			System.out.println("Class not found");
			System.out.println(e);
			
		}*/
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your name");
		String name=br.readLine();
		System.out.println("Name: "+name);
		System.out.println("Enter your percentage:");
		float per=Float.parseFloat(br.readLine());
		System.out.println("Percentage: "+per);}

}
