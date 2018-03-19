package mybasics.session11.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exceptionsfilenotfound {
	
	public void method1()
	{
		try {
			FileReader fr=new FileReader(new File("hi"));
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		Exceptionsfilenotfound ef=new Exceptionsfilenotfound();
		ef.method1();
	}

}
