package mybasics.session12.genericsbasics;

import java.util.ArrayList;
import java.util.List;

public class GenericDemo {
	public static void main(String[] args) {
		List colors=new ArrayList();
		colors.add(1);
		colors.add("hi");
				//String s =(String) colors.get(0);
				System.out.println(colors.get(1)); 
				System.out.println(colors.get(0));
				
	}

}
