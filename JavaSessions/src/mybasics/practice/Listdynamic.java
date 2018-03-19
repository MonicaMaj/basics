package mybasics.practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Listdynamic {

	public static void main(String[] args) {
		
		
		List<Integer> numbers=new ArrayList<>();
		
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter no of elements");
		int n=s.nextInt();
		int x;
		System.out.println("enter elements into List");
		for (int i = 0; i < n; i++) {
			x=s.nextInt();
			numbers.add(x);
		}
		Iterator<Integer> it=numbers.iterator();
		while (it.hasNext()) {
			Integer integer = (Integer) it.next();
			System.out.println(integer);
		}
		}
	}


