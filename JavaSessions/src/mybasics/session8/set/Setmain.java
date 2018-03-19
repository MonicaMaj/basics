package mybasics.session8.set;


import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Setmain {
	public static void main(String[] args) {
		Set<String> colors=new HashSet<>();
		colors.add("red");
		colors.add("red");
		colors.add("red");
		System.out.println(colors.size());
		
		for (String string : colors) {
			
		System.out.println(string);
		}
		
		Students s1=new Students("monica", "a17");
		Students s2=new Students("chaithu", "a18");
		Students s3=new Students("lemona", "a19");
		Students s4=new Students("manisha", "a10");
		Students s5=new Students("monica", "a17");
		Set<Students>students=new HashSet<>();
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		students.add(s5);
		System.out.println(students.size()); 
		
		System.out.println("hello".hashCode());
		for (Students students2 : students) {
			System.out.println(students2);
		}
		
		Set<Students> stsudentsts=new TreeSet<>();
	
		
		stsudentsts.add(s1);
		stsudentsts.add(s2);
		stsudentsts.add(s3);
		stsudentsts.add(s4);
		stsudentsts.add(s5);
		
		
		System.out.println(stsudentsts.size());
		for (Students students2 : stsudentsts) {
			System.out.println(students2);
		}
		
		
		Set<Students> stsudentstss=new TreeSet<>(new Setcomparator());
		
		stsudentstss.add(s1);
		stsudentstss.add(s2);
		stsudentstss.add(s3);
		stsudentstss.add(s4);
		stsudentstss.add(s5);
		
		
		System.out.println(stsudentstss.size());
		for (Students students2 : stsudentstss) {
			System.out.println(students2);
		}
		
		
	} 

}
