package mybasics.session14.java8.methodreferences;

public class Helper {

	//artibratry class
	
	public static int comparecustomers(Customer o1,Customer o2)
	{
		return o1.getName().compareTo(o2.getName());
	}
	
}
