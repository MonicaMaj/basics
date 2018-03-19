package mybasics.session7;

import java.util.ArrayList;
import java.util.List;

public class Arraylistbasic {
	public static void main(String[] args) {
		
	
	
	List<String> colors=new ArrayList<>();
	colors.add("red");
	colors.add("blue");
	colors.add("green");
	for(String s:colors)
	{
		System.out.println(s);
	}
	System.out.println(colors.get(0));
	System.out.println(colors.remove(0));
	System.out.println("-------------");
	for(String s:colors)
	{
		System.out.println(s);
	}
	System.out.println(colors.get(0));
	colors.add(0, "white");
	System.out.println("-------------");
	for(String s:colors)
	{
		System.out.println(s);
	}
	
	colors.set(1,"black");
	System.out.println("-------------");
	for(String s:colors)
	{
		System.out.println(s);
	}
	
	
	

}
}