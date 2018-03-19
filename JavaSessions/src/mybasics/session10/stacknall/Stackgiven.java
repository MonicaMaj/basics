package mybasics.session10.stacknall;

import java.util.Stack;

public class Stackgiven {
	public static void main(String[] args) {
		Stack<Integer> s=new Stack<>();
		s.push(1);
		s.push(2);
		System.out.println(s);
		
		int peekk=s.peek();
		System.out.println(peekk);
		s.pop();
		
		System.out.println(s);
		System.out.println(s.get(0));
		
	}

}
