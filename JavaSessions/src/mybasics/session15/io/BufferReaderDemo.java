package mybasics.session15.io;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;


public class BufferReaderDemo {
	public static void main(String[] args) {
		try {
			
		
		BufferedReader bi=new BufferedReader(new FileReader("bufferreader.txt"));
		String line=bi.readLine();
		
		while(line != null) {
		
			System.out.println(line);
			line=bi.readLine();
	}
		bi.close();
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	
	}

}
