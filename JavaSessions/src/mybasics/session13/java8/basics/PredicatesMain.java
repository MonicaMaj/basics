package mybasics.session13.java8.basics;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicatesMain {
	public static void main(String[] args) {
		Customer c1=new Customer("monica", "irving");
		Customer c2=new Customer("priyanka", "irving");
		Customer c3=new Customer("renuka", "boring");
		Customer c4=new Customer("sarika", "boring");
		
		List<Customer> customers=new ArrayList<>();
		customers.add(c1);
		customers.add(c2);
		customers.add(c3);
		customers.add(c4);
		
		for (Customer customer : customers) {
			System.out.println(customer);
		}
		System.out.println("----------");
		
		customers.forEach(cust -> System.out.println(cust));
		
		System.out.println("----------");
		
		//anonymous
		Predicate<Customer> p1=new Predicate<Customer>() {
			
			@Override
			public boolean test(Customer t) {
				return t.getCity().equals("boring");
			}
		};
	
		customers.forEach(cust -> {if(p1.test(cust)) System.out.println(cust);});
		
		
		System.out.println("----------");
		//lamda
		Predicate<Customer> p2=(t)-> {return t.getCity().equals("irving");};
		customers.forEach(cust -> {if(p2.test(cust)) System.out.println(cust);});
	
	}

}
