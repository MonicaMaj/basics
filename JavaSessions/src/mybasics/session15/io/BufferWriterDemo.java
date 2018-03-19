package mybasics.session15.io;

import java.io.BufferedWriter;

import java.io.FileWriter;


public class BufferWriterDemo {
	public static void main(String[] args) {
		
		String s="hello hai bye tata";
		try {
			BufferedWriter bi=new BufferedWriter(new FileWriter("bufferreader.txt"));
		
		bi.write(s);
		bi.flush();
		bi.close();
		
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
