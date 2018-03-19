package mybasics.session8.set;

import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import mybasics.session8.list.Students;

public class Linkedlistdemo {
	public static void main(String[] args) {
		LinkedList<Students> students=new LinkedList<>();
		Students s1=new Students("majiga", "a17");
		Students s2=new Students("moni", "48");
		Students s3=new Students("mona", "49");
		Students s4=new Students("monic", "50");
		
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		
		List<Students>students1=new Vector<>();
		students1.add(s1);
		students1.add(s2);
		
		
		
	}

}
