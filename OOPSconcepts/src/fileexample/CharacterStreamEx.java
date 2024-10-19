package fileexample;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamEx {

	public static void main(String[] args) throws IOException {
		//character stream----FileWriter-writing,FileReader-reading
		File f=new File("E:File2");
		FileWriter fw=new FileWriter(f);
		fw.write("Hello everyone.Welcome to java full stack course");
		fw.close();
		System.out.println("Content written successfully");
		
		FileReader fReader=new FileReader("E:File2");
		BufferedReader bReader=new BufferedReader(fReader);
		int records;
		while((records = bReader.read()) !=-1) {
			System.out.print((char)records);
		}
		//bReader.close();
		//fReader.close();
		
		
		// TODO Auto-generated method stub

	}

}
