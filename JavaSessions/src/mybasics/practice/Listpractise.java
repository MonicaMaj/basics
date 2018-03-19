package mybasics.practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Listpractise {

	public static void main(String[] args) {
		List<Integer> num = new ArrayList<>();
		num.add(1);
		num.add(2);
		num.add(3);

		Iterator<Integer> it = num.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("----");
		ListIterator<Integer> lit = num.listIterator();

		while (lit.hasNext()) {
			System.out.println(lit.next());
		}

		List<Customer> cus = new ArrayList<>();
		Customer c1 = new Customer("moni");
		Customer c2 = new Customer("mona");
		Customer c3 = new Customer("monu");
		cus.add(c1);
		cus.add(c2);
		cus.add(c3);
		ListIterator<Customer> lit1 = cus.listIterator(cus.size());

		while (lit1.hasPrevious()) {
			System.out.println(lit1.previous());
		}

	}

}
