package mybasics.session15.io;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class BufferedOutputStreamDemo {
	public static void main(String[] args) {
		
		String s="hello hai bye tata";
		try {
		
		FileOutputStream fo=new FileOutputStream(new File("tata.txt"));
		BufferedOutputStream bo=new BufferedOutputStream(fo);
		byte[] contents=s.getBytes();
		bo.write(contents);
		bo.flush();
		bo.close();
		fo.close();
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
