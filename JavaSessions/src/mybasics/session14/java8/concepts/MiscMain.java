package mybasics.session14.java8.concepts;

import java.util.StringJoiner;

public class MiscMain {
	public static void main(String[] args) {
		//join
		String join=String.join("and", "i","miss","u");
		System.out.println(join);
		
		String [] joinarray= {"i","we","they"};
		String jarr=String.join("M", joinarray);
		System.out.println(jarr);
	
		//string joiner
		StringJoiner sj1=new StringJoiner("!!!", "[", "]");
		sj1.add("hello").add("welcome").add("thanks");
		System.out.println(sj1);
		System.out.println(sj1.toString());
		
		//merge
		StringJoiner sj2=new StringJoiner("!!!", "[", "]");
		sj2.add("sorry");
		sj1.merge(sj2);
		System.out.println(sj1);
		
	}

}
