//Copying file 

package com.edu.iooper;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadAndWrite {
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("list of courses.txt");
        FileOutputStream fos=new FileOutputStream("copylistofcourses.txt");
        int b;
        while((b=fis.read())!=-1) { 
        	//-1 is the endof the file
        	fos.write(b);
        	}fis.close();
         
             fos.close();
         
	}

}

