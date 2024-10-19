package fileexample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopying {

	public static void main(String[] args){
		File sourceFile=new File("sourcefile.txt");
		File destinationFile=new File("Destinationfile.txt");
		try (
			FileInputStream fis=new FileInputStream(sourceFile);
			FileOutputStream fos=new FileOutputStream(destinationFile)
			)
		{
			byte[] buffer=new byte[1024];
			int length;
			while((length=fis.read(buffer))>0) {
				fos.write(buffer,0,length);
				
			}
			System.out.println("File copied succesfully");
		}catch(IOException e) {
			System.out.println("An error occured during file copy:"+e.getMessage());
		}
		// TODO Auto-generated method stub

	}

}
