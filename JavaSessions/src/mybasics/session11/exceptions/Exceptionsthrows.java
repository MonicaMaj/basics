package mybasics.session11.exceptions;

import java.util.Scanner;

public class Exceptionsthrows {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		int a,b;
			Scanner s=new Scanner(System.in);
			System.out.println("enter the value a ");
			a=s.nextInt();
			System.out.println("enter the value b ");
			b=s.nextInt();
			System.out.println("the division of a and b is:");								
			int d = a / b;
			System.out.println(d);
	
		
	}

}
