package mybasics.practice;

import mybasics.session8.set.Students;

public class GarbageCollection {

	public static void main(String[] args) {

		Customer c=new Customer("Friends");
		
		System.out.println(c);
		
		c=null;
		
		//System.gc();
		System.out.println(c);
		
		Students s=new Students("monica", "25");//
		
		System.out.println(s);
		
		s=null;
		
		System.out.println(s);
	}

}
