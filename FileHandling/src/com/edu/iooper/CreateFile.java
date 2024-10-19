package com.edu.iooper;
import java.io.File;
import java.io.IOException;


public class CreateFile {
	public static void main(String[] args)throws IOException{
		System.out.println("Creating a file");
		File myfile=new File("hello.txt");
		if(myfile.createNewFile()) {
			System.out.println("File is created");
		
		}else {
			System.out.println("File already exists");
		}
	}

}
