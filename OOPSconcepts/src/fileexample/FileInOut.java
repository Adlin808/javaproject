package fileexample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInOut {

	public static void main(String[] args) throws IOException {
		//Byte Stream
		//Write the data
		File f=new File("E:File1.txt");
		FileOutputStream fos=new FileOutputStream(f);
		String s=".....Hello Everyone 12521 learners.....Java Full Stack......Java provides I/O streams to read and write";
		byte b[]=s.getBytes();
		fos.write(97);//a
		fos.write(66);//B
		fos.write(67);//C
		fos.write(b);
		System.out.println("Content written successfully");
		//Read the content
		FileInputStream fis=new FileInputStream("E:File1.txt");
		System.out.println("File content");
		int i=fis.read();
		//System.out.println((char) i);
		System.out.println();
		while(i!=-1) {//-1----<end of file
			System.out.print((char) i);
			i=fis.read();
		}
		fis.close();
		

	}

}
