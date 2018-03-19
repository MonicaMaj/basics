package mybasics.session13.java8.basics;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class MathExamplesinJava8 {
	public static void main(String[] args) {
		Person p1=new Person("monica",60);
		Person p2=new Person("sarica",70);
		Person p3=new Person("renuca",80);
		Person p4=new Person("harica",90);
		List<Person> persons=new ArrayList<>();
		persons.add(p1);
		persons.add(p2);
		persons.add(p3);
		persons.add(p4);
		//compute average
		
		OptionalDouble od=persons.stream().mapToDouble(person -> person.getAge()).average();
		if(od.isPresent())
		{
			System.out.println(od.getAsDouble() );
		}
		//to count
		Long count=persons.stream().count();
		System.out.println( count);
		
		//intstream
		//to print from 1 to 100
		IntStream.range(1, 101).forEach(pri -> System.out.println(pri));
		
		//to print multiples of 5
		IntStream.range(1, 101).forEach(p-> {if(p%5==0) System.out.println(p);});
		
		//to iterate 
		IntStream.of(1,2,3,4,5).forEach(s-> System.out.println(s));
		
	}
	
}
