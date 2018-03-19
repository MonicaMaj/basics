package mybasics.session10.stacknall;

import java.util.LinkedList;

public class Queue {
	public static void main(String[] args) {
		 
		java.util.Queue<String> queue=new LinkedList<>();
		queue.add("a");
		queue.add("b");
		queue.add("c");
		queue.add("d");
		System.out.println(queue);
		
		System.out.println(queue.peek());
		queue.poll();
		System.out.println(queue);
		
		
	
	}
	

}
