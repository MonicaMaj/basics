package mybasics.session11.exceptions;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Excetionsarthmetic {

	
			public static void main(String[] args) {
				
				int a,b;
				
				//resumption:possible in looping 
				//whenever try need to be executed again upon catch block is done, then need to be done with looping
				
				boolean looping=true;
				while(looping)
				{
				try {
					Scanner s=new Scanner(System.in);
					System.out.println("enter the value a ");
					a=s.nextInt();
					System.out.println("enter the value b ");
					b=s.nextInt();
					System.out.println("the division of a and b is:");								
					int d = a / b;
					System.out.println(d);
					looping=false;
				}
				catch (ArithmeticException ae) {
					System.out.println(ae.getMessage());
					System.out.println("b shouldnt be 0");
					
				} 	
				catch (InputMismatchException ne) {
					//System.out.println(ne.getMessage());
					System.out.println("strictly NUMBERS");
					//System.out.println("Enter again");
					//a=s.nextInt();
					//a=0;
				}

			
				
			}



		

	}
}
		
		//FileReader fr = new FileReader(new File("hi"));
		//Connection c = DriverManager.getConnection("", "", "");
		/*	
		catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			System.out.println();
			// e.printStackTrace();
		} */		
	/*	catch (SQLException se) {
		System.out.println(se.getMessage());
		 se.printStackTrace();
	}
*/

