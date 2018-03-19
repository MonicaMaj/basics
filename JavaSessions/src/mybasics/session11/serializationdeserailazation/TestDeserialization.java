package mybasics.session11.serializationdeserailazation;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;


public class TestDeserialization {
	public static void main(String[] args) throws ClassNotFoundException {
		try
		{
			FileInputStream fi=new FileInputStream("myfirst.ser");
			ObjectInputStream oi=new ObjectInputStream(fi);
			
			Employee emp1=(Employee)oi.readObject();
			System.out.println(emp1.getName()+emp1.getId()+emp1.getPhnnum());
			
			Employee emp2=(Employee)oi.readObject();
			System.out.println(emp2.getName()+emp2.getId()+emp2.getPhnnum());
			
			oi.close();
			fi.close();
		}
		catch (IOException io) {
		System.out.println(io);
		}
		
		
		
		
		
		
		
		
		
		
	}

}
