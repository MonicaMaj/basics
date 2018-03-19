package mybasics.session12.genericsbasics;

import java.util.Scanner;

public class Swap<T> {
	
	
	@SuppressWarnings({ "unchecked", "resource", "hiding" })
	public <T> void swapping()
	{
		T a;
		T b;
		Scanner s=new Scanner(System.in);
		        System.out.println("Enter value");
				a=(T) s.nextLine();
				//System.out.println("hi");
				System.out.println("Enter value");
				b=(T) s.nextLine();
        
		T temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("After Swapping");
		System.out.println(a+ " " +b);
		
	}
	
	public static void main(String[] args) {
		
		
		Swap<Double> ints=new Swap<>();
		ints.swapping();
		
		
		
		
		//ints.swapping(2, 3);
	
		
		//Swap<String> strng=new Swap<>();
		//strng.swapping("monica", "majiga"); 
	} 
	
}
