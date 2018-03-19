package mybasics.session12.generics.wildcards;

import java.util.List;

public class Wildcard {
//unbounded wildcards
	public static  void dance(List<?> dancetypes)
	{
		
	}
	
	public static <T> void dance1(List<T> dancetypes)
	{
		
	}
	//BOUNDED WILDCARDS
	public static  void dance2(List<String> dancetypes)
	{
		
	}
	
}
