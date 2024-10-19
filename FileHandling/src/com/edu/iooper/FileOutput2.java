package com.edu.iooper;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileOutput2 {
	public static void main(String[] args)throws IOException{
		FileOutputStream fos=new FileOutputStream("myinfo.txt");
		String str="Learn java programming";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the information: ");
		String s=sc.nextLine();
		System.out.println("My information");
		//You may ask user what information user wants to write
		fos.write(str.getBytes());
		fos.close();
	}

}
