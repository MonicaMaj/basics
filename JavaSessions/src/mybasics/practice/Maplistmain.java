package mybasics.practice;

import java.util.ArrayList;
import java.util.HashMap;

import java.util.List;
import java.util.Map;

public class Maplistmain {
	
	
	public static void main(String[] args) {
		Map<List<Customer>,Integer> names=new HashMap<>();
		
		List<Customer> namesList=new ArrayList<>();
		
		Customer c1=new Customer("monica");
		Customer c2=new Customer("monic");
		Customer c3=new Customer("moni");
		
		namesList.add(c1);
		namesList.add(c2);
		namesList.add(c3);
		 		
		names.put((List<Customer>) c1,1);
		names.put((List<Customer>) c2,2);
		names.put((List<Customer>) c3,3);
		
		for(Map.Entry<List<Customer>, Integer> arranged : names.entrySet() )
			
		{
			System.out.println(arranged.getKey());
			System.out.println(arranged.getValue());
		}
		
		
		
		
		
		
		
		
		
		
		//names.forEach((K,V)->{System.out.println(K);System.out.println(V);});
		
	}

}
