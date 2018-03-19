package mybasics.session15.io;

import java.io.File;

import java.io.FileWriter;

public class FileWriterDemo {

	public static void main(String[] args) {
		String s="GUD MNG GUD EVNG GUD NYT";
		try {
		
		FileWriter fo=new FileWriter(new File("reader.txt"));
		
		fo.write(s);
		fo.close();
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
