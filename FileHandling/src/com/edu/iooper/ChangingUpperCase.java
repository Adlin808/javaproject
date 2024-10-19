//Copying file 
package com.edu.iooper;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
public class ChangingUpperCase {

	public static void main(String[] args) throws IOException {
		
         FileInputStream fis=new FileInputStream("list of courses.txt");
         FileOutputStream fos=new FileOutputStream("copylistofcourses1.txt");
         int b;
         while((b=fis.read())!=-1) { //-1 is the endof the file
        	 if(b>=97 && b<=120)  //A-65 Z=90   a=97 to z=120 a to z                    
        	   fos.write(b-32);     //AB              ab
        	 else                   //97-32=65
        		fos.write(b);  }//98-32=66
         fis.close();
         fos.close();
         
	}

}

