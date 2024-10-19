package exceptionex;

import java.io.File;
import java.io.FileNotFoundException;

public class FileNotCheckException {

	public static void main(String[] args) throws FileNotFoundException{
		File f=new File("D:/HTML5/external.css");
		if(f.exists()) {
			System.out.println("Welcome,we got into the file"+f);
		}
		else {
			System.out.println("File not exist");
		}
		// TODO Auto-generated method stub

	}

}
