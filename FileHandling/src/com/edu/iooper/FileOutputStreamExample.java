package com.edu.iooper;
//import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileOutputStreamExample {

	public static void main(String[] args) throws IOException
	//{try
	{
		OutputStream outobj=null;//new FileOutputStream("Output.txt");
		outobj=new FileOutputStream("myoutfile.txt");
		outobj.write(70);
		outobj.write(65);
		outobj.write(78);
		outobj.close();
		System.out.println("Successfully created and written the file");
		
	//}catch(IOException e){
		//System.out.println("Exception");
	}
		
	}

//}

