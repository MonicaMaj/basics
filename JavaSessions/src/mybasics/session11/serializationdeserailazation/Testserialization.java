package mybasics.session11.serializationdeserailazation;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Testserialization {
	public static void main(String[] args) {
		
		Employee emp1=new Employee();
		emp1.setId("a47");
		emp1.setName("monica");
		emp1.setPhnnum("618-612-3358");
		
		Employee emp2=new Employee();
		emp2.setId("a47");
		emp2.setName("monica");
		emp2.setPhnnum("618-612-3358");
		
		try {
			FileOutputStream fo=new FileOutputStream("myfirst.ser");
			ObjectOutputStream oo=new ObjectOutputStream(fo);
			oo.writeObject(emp1);
			oo.writeObject(emp2);
			oo.close();
			fo.close();
		}
		catch (IOException io) {
			System.out.println(io);
		}
		
		
		
		
		
		
		
	}

}
