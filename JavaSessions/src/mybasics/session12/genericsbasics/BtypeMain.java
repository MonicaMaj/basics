package mybasics.session12.genericsbasics;

public class BtypeMain {

	
	

	public static void main(String[] args) {
		
		Btype b1=new Btype();
		//b1.inspect("hi");     only numbers
		b1.inspect(7.8);
		
		b1.inspect1("hi");
		b1.inspect1(9);
		
		int [] numbers={1,1,1,2};
				int count=b1.calculate(1,numbers );
				System.out.println(count);
				
		String[] searacharray= {"a","s","s","s","s"};
		int c	=b1.calculate2("s", searacharray);
		System.out.println(c);
		 
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
