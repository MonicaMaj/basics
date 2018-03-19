package mybasics.session14.java8.methodreferences;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



public class CustomersMain {
	public static void main(String[] args) {
		Customer c1=new Customer("monica", "irving");
		Customer c2=new Customer("priyanka", "hyderabad");
		Customer c3=new Customer("aenuka", "boring");
		Customer c4=new Customer("sarika", "secunderabad");
		
		List<Customer> customers=new ArrayList<>();
		customers.add(c1);
		customers.add(c2);
		customers.add(c3);
		customers.add(c4);
		
		Comparator<Customer> customerscomp=(o1,o2)-> {return o1.getName().compareTo(o2.getName());};
		//different ways to sort
		Collections.sort(customers, customerscomp);
		
		Collections.sort(customers,(o1,o2)-> o1.getName().compareTo(o2.getName()));
		//Method references
		//for static methods
		Collections.sort(customers, Customer :: comparecustomers);//for static methods
		
		Customer cm=new Customer();
		Collections.sort(customers, cm :: nonstaticcomparecustomers);//for non static methods
		
		customers.forEach(c->System.out.println(c));
		
		Collections.sort(customers, Helper :: comparecustomers);//for arbitrary class
		
		
		
	}

}
