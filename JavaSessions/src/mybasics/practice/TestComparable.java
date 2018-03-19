package mybasics.practice;

import java.util.Comparator;

public class TestComparable {

	public static void main(String[] args) {
/*		
		Comparable<Customer> c=new Comparable<Customer>() {
			
			@Override
			public int compareTo(Customer o) {
				// TODO Auto-generated method stub
				return o.getName().compareTo(this.getName());
			}
		};*/
		Comparator<Customer> c1=new Comparator<Customer>() {
			
			@Override
			public int compare(Customer o1, Customer o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareTo(o2.getName());
			}
		};

	}

}
