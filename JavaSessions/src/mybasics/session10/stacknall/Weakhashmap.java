package mybasics.session10.stacknall;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class Weakhashmap {
	public static void main(String[] args) {
		
		Map<String, String> weakhashmap=new WeakHashMap<>();
		Map<String, String> stronghashmap=new HashMap<>();
		String s1=new String("hello");
		String s2=new String("hello");
		weakhashmap.put(s1, "value1");
		stronghashmap.put(s2, "value2");
		
		s1=null;
		s2=null;
		
		System.gc();//calling garbage collector
		
		System.out.println(weakhashmap);
		System.out.println(stronghashmap);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
