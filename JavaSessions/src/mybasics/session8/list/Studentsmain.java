package mybasics.session8.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import mybasics.session8.set.Sortingcollections;

public class Studentsmain {
	public static void main(String[] args) {
		

	List<Students> students= new ArrayList<>();

	Students s1=new Students("monica", "47");
	Students s2=new Students("moni", "48");
	Students s3=new Students("mona", "49");
	Students s4=new Students("monic", "50");
	
	students.add(s1);
	students.add(s2);
	students.add(s3);
	students.add(s4);
	//students.add(s5);
	System.out.println(students.size());
	
	for (Students stu : students)
	{
		System.out.println(stu);
		
	}
	System.out.println("--------------");
	
	Iterator<Students> it= students.iterator();
		
		while(it.hasNext())
		{
			//Students s=it.next();
			System.out.println(it.next());
		}
		System.out.println("--------------");

		ListIterator<Students> lit= students.listIterator();
		
		
		while(lit.hasNext())
		{
			//Students s=it.next();
			System.out.println(lit.next());
		}
		
		Students s6=new Students("monica", "47");
		//students.add(s6); 
		//System.out.println(students.contains(s1));
		System.out.println(students.contains(s6));
		System.out.println(s1.equals(s6)); 


		Collections.sort(students);
		for (Students students2 : students) {
			System.out.println(students2);
		}
		System.out.println("-------------");
		
		Comparator<Students> s11=new Comparator<Students>() {
			
			@Override
			public int compare(Students o1, Students o2) {
				return o1.getId().compareTo(o2.getId());
			}
		};
	Collections.sort(students,s11);
		for (Students students3 : students) {
			System.out.println(students3);
		}
		
	}
	
	}
	
	

