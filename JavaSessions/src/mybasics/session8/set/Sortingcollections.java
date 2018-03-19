package mybasics.session8.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import mybasics.session8.list.Students;



public class Sortingcollections implements Comparator<Students>{
	public static void main(String[] args) {
		List<String> colors=new ArrayList<>();
		colors.add("blue");
		colors.add("black");
		colors.add("brown");
		Collections.sort(colors);
		for (String string : colors) {
			System.out.println(string);
			
		}
		Collections.sort(colors,Collections.reverseOrder());
		for (String string : colors) {
			System.out.println(string);
			
		}
		
		//comparator
	}

	@Override
	public int compare(Students o1, Students o2) {
	
		return o1.getId().compareTo(o2.getId());
	}

}
