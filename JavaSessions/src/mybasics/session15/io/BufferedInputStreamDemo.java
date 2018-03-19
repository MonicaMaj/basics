package mybasics.session15.io;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

public class BufferedInputStreamDemo {
	public static void main(String[] args) {
		try {
			
		FileInputStream fi=new FileInputStream(new File("tata.txt"));
		BufferedInputStream bi=new BufferedInputStream(fi);
		byte[] contents=new byte[1024];
		int bytesread=0;
		while((bytesread=bi.read(contents)) != -1) {
			String str=new String(contents, 0, bytesread);
			System.out.println(str);
	}
		fi.close();
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	
	}

}
