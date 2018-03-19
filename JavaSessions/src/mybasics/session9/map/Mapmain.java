package mybasics.session9.map;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;



public class Mapmain {
	public static void main(String[] args) {
		Map<String, String> colors=new HashMap<>();
		colors.put("red", "r");
		colors.put("green", "g");
		colors.put("red", "rd");
		System.out.println(colors.size());
		
		/*for (Map.Entry<String, String> string : colors.entrySet()) {
			System.out.println(string.getKey());
			System.out.println(string.getValue());
			}
		*/
	/*	//HASHTABLE
		System.out.println("-------");
		Map<String, String> colorsTBL=new Hashtable<>();
		colorsTBL.put("red", "r");
		colorsTBL.put("green", "g");
		colorsTBL.put(null, "rd");
		System.out.println(colors.size());
		Error since null value*/
		
		
		
		
		
		
		
		
		Map<Customers, Integer> customers=new HashMap<>();
		Customers c1=new Customers("monica", 47, "carbondale");
		Customers c2=new Customers("meena", 48, "carbond");
		Customers c3=new Customers("manogna", 48, "car");
		Customers c4=new Customers("manisha", 49, "bondale");
		Customers c5=new Customers("monica1", 50, "carbondale");
		
		customers.put(c1, 1);
		customers.put(c2, 2);
		customers.put(c3, 3);
		customers.put(c4, 4);
		customers.put(c5, 5);
		
		/*for (Map.Entry<Customers, Integer> string : customers.entrySet()) 
		{
		System.out.print(string.getKey());
		System.out.println(string.getValue());
		}
		System.out.println("-----------------");*/
		
		Map<Customers, Integer> customers1=new TreeMap<>();
		customers1.put(c1, 1);
		customers1.put(c2, 2);
		customers1.put(c3, 3);
		customers1.put(c4, 4);
		customers1.put(c5, 5);
		
		for (Map.Entry<Customers, Integer> string1 : customers1.entrySet()) 
		{
		System.out.println(string1.getKey());
		System.out.println(string1.getValue());
		}
		
		System.out.println("-----------------");
		//ANANYMOUS
		Map<Customers, Integer> customers2=new TreeMap<>(new Comparator<Customers>()
		{

			@Override
			public int compare(Customers o1, Customers o2) {
				// TODO Auto-generated method stub
				return 0;
			}
		});
		customers2.put(c1, 1);
		customers2.put(c2, 2);
		customers2.put(c3, 3);
		customers2.put(c4, 4);
		customers2.put(c5, 5);
		
		for (Map.Entry<Customers, Integer> string2 : customers2.entrySet()) 
		{
		System.out.println(string2.getKey());
		System.out.println(string2.getValue());
		}
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
