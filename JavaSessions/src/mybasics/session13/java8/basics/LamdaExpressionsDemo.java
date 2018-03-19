package mybasics.session13.java8.basics;

import java.util.Comparator;

import mybasics.practice.Customer;

public class LamdaExpressionsDemo {
	
	public static void main(String[] args) {
		
		Comparator<Customer> c1=new Comparator<Customer>() {
			
			@Override
			public int compare(Customer o1, Customer o2) {
				// TODO Auto-generated method stub
				return 0;
			}
		};
		
		Comparator<Customer> c2=(o1,o2) -> { return o1.getName().compareTo(o2.getName()); };
		
		sampleforLamdas s1=new sampleforLamdas() {
			
			@Override
			public void test() {

					System.out.println("welcum lamda");
				
			}
			
		};
		s1.test();
		sampleforLamdas s2= () -> System.out.println("hii");
		s2.test();
		
	}

}
