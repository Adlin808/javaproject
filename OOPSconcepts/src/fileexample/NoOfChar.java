package fileexample;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class NoOfChar {

	public static void main(String[] args) throws IOException {
		File f = new File("E:File1.txt");
		BufferedReader br = new BufferedReader(new FileReader(f));
		int charcnt = 0;
		int wordcnt=0;
		int linecnt=0;
		String line;
		while ((line = br.readLine()) != null) {
			linecnt++;
			
			String[] words=line.split(" ");
			wordcnt=wordcnt+words.length;
			charcnt=charcnt+line.length();
		}

		br.close();
		System.out.println("Number of lines inside file:"+linecnt);
		System.out.println("Number of words inside file:"+wordcnt);
		System.out.println("Number of characters inside file:"+charcnt);
		

	}
}
