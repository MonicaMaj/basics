package mybasics.session13.java8.streams;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import mybasics.session13.java8.basics.Customer;

public class StreamBasic {
	
	public static void main(String[] args) {
		String [] colors= {"red","green","yellow"};
		
		Stream<String> colorstream=Stream.of(colors);
		//first way
		colorstream.forEach(col -> System.out.println(col));
		System.out.println("------------------");
		
		//second way
		Arrays.stream(colors).forEach(col -> System.out.println(col));
		System.out.println("------------------");
		
		//Parallelstream
		Arrays.parallelSort(colors);
		
		//filter 
		
		Customer c1=new Customer("monica", "irving");
		Customer c2=new Customer("priyanka", "irving");
		Customer c3=new Customer("renuka", "boring");
		Customer c4=new Customer("sarika", "boring");
		
		List<Customer> customers=new ArrayList<>();
		customers.add(c1);
		customers.add(c2);
		customers.add(c3);
		customers.add(c4);
		
		//ITERATE----stream
		customers.stream().forEach(cus -> System.out.println(cus));
		System.out.println("------------------");
		
		//ITERATE----parallelstream- in random order for core environment
		customers.parallelStream().forEach(cus -> System.out.println(cus));
		//or
		customers.stream().parallel().forEach(cus -> System.out.println(cus));
		
		System.out.println("------------------");
		
		//filter uses a predicate
		Predicate<Customer> predicatestream=(t)-> {return t.getCity().equals("irving");};
		
		//collect in list
		List<Customer> irvingcustomers =customers.stream().filter(predicatestream).collect(Collectors.toList());
		irvingcustomers.forEach(cus -> System.out.println(cus));
		System.out.println("------------------");
		
		//collect in set
		Set<Customer> irvingcustomersset =customers.stream().filter(predicatestream).collect(Collectors.toSet());
		irvingcustomersset.forEach(cus -> System.out.println(cus));
		
		//collect in map
	
		Map<String,List<Customer>>collectormapist =customers.stream().collect(Collectors.groupingBy(cust -> cust.getCity(), Collectors.toList()));
		collectormapist.forEach((s,c)-> {System.out.println(s); System.out.println(c);});
		
		System.out.println("------------------");
		Map<String,Set<Customer>>collectormapset =customers.stream().collect(Collectors.groupingBy(cust -> cust.getCity(), Collectors.toSet()));
		collectormapset.forEach((s,c)-> {System.out.println(s); System.out.println(c);});
	}

}
