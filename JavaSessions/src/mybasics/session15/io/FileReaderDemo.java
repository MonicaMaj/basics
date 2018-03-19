package mybasics.session15.io;

import java.io.File;

import java.io.FileReader;

public class FileReaderDemo {
	public static void main(String[] args) {
		try {
		
		FileReader fi=new FileReader(new File("reader.txt"));
		int i;
		while((i=fi.read()) != -1) {
			System.out.print((char)i);
	}
		fi.close();
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		
	}
}
