package mybasics.session9.map;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import mybasics.session8.list.Students;

public class Modificationsinloops {
	public static void main(String[] args) {
		//add fails for foreach as well iterator-concurrent exception
		//delete/remove as well but there is a good way to del in iterator as follows without exception
		//for update prefer foreach

		
		List<String> colors=new ArrayList<>();
		colors.add("red");
		colors.add("blue");
		colors.add("green");
	//remove
		Iterator<String> it=colors.iterator();
		while(it.hasNext())
		{
		String color=it.next();
					System.out.println(color);
					if(color.equals("green"))
					{
						it.remove();
					}
		}
		System.out.println(colors.size());
		//update
		for (String string : colors) {
			if(string.equals("red")) {
				colors.set(0, "pink");
			}
			System.out.println(string);
	
		}
		for (String string : colors) {
			System.out.println(string);
		}
		
		//I dint get
		Iterator<String> uit=colors.iterator();
		while(uit.hasNext())
		{
		String color1=uit.next();
					System.out.println(color1);
					if(colors.equals("green"))
					{
						colors.set(1, "magenda");
					}
		}
		Iterator<String> uitt=colors.iterator();
		while(uitt.hasNext())
		{
		String color2=uitt.next();
					System.out.println(color2);
				
		}
		
		
		
		
		
		
		
		
	}

}
