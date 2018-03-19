package mybasics.session15.io;

import java.io.File;
import java.io.FileInputStream;

public class FileInputStreamDemo {
	public static void main(String[] args) {
		try {
		
		FileInputStream fi=new FileInputStream(new File("hello.txt"));
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
