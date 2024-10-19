package exceptionex;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileNotCheckedException {

	public static void main(String[] args) {
		File fileObj=new File("D:/HTML5/one.txt.txt");
		FileInputStream fISObj=null;
		try {
			fISObj=new FileInputStream(fileObj);
			while(fISObj.read()!=-1) {
				System.out.println((char)fISObj.read());}
			}
			catch(FileNotFoundException e) {
				e.printStackTrace();
			}
			catch(IOException e) {
				e.printStackTrace();
			}
			
		
		// TODO Auto-generated method stub

	}

}
