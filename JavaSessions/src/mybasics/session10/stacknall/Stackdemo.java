package mybasics.session10.stacknall;


import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class Stackdemo {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Stack<Integer>numbers=new Stack<>();
				
		int x;
		for (int i = 0; i < 3; i++) {
			
			System.out.println("enter elements");
				x=s.nextInt();
				numbers.push(x);
								
		}
			
			
			
		for (Integer integer : numbers) {
			System.out.println(integer);
		}
		
	
		
		
	
	}
		
		
	}


