package mybasics.session15.io;

import java.io.File;
import java.io.FileOutputStream;

public class FileOutputStreamDemo {

	public static void main(String[] args) {
		String s="hello hai bye";
		try {
		
		FileOutputStream fo=new FileOutputStream(new File("hello.txt"));
		byte[] contents=s.getBytes();
		fo.write(contents);
		fo.close();
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
