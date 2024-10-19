package fileexample;

import java.io.File;
import java.io.IOException;

public class FileOperation {

	public static void main(String[] args) throws IOException {
		File newFile=new File("E:File1.txt");
		System.out.println("Absolute path:"+newFile.getAbsolutePath());
		File newFile1=new File("method.txt");
		System.out.println("Relative Path:"+newFile1.getCanonicalPath());
		System.out.println("Absolute Path:"+newFile1.getAbsolutePath());
		System.out.println("RW:"+newFile.canRead());
		System.out.println("Read Write:"+newFile.canWrite());
		System.out.println("File Name:"+newFile.getName());
		System.out.println("Size of the file:"+newFile.length());
		System.out.println(newFile.getParent());
		
		File newFile2=new File("E:\\java-programs-7883");
				String[] list=newFile2.list();
		System.out.println("List of files:"+list.length);
		for(int i=0;i<list.length;i++) {
			System.out.println(list[i]);
		}
		File f=new File("E:File2.txt");
		if(f.createNewFile()) {
			System.out.println("File created");
		}else {
			System.out.println("File exists");
		}
		
		

	}

}
