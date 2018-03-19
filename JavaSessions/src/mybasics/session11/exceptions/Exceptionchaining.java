package mybasics.session11.exceptions;

public class Exceptionchaining {
	
	public static void m1() {
		m2();
	}

	public static void m2()
	{
		m3();
	}
	
	public static void m3()
	{
		throw new RuntimeException();
	}
	
	public static void main(String[] args) {
		m1();
		m3();
		
	}
}
