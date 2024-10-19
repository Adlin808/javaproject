package fileexample;

import java.io.File;
import java.io.IOException;

public class NewFile {

	public static void main(String[] args) throws IOException {
		File f=new File("E:File1.txt");
		if(f.createNewFile()) {
			System.out.println("File created");
		}else {
			System.out.println("File exists");
		}
		

	}

}
