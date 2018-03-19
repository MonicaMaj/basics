package mybasics.session10.stacknall;

import java.util.IdentityHashMap;
import java.util.Map;

public class Identityhashmap {
	public static void main(String[] args) {
		
		Map<String, String> idenhasmap=new IdentityHashMap<>();
		String s1=new String("Hello");
		String s2=new String("Hello");
		
		String s3="Hello";
		String s4="Hello";
		idenhasmap.put(s1, "value1");
		idenhasmap.put(s2, "value2");
		idenhasmap.put(s3, "value3");
		idenhasmap.put(s4, "value4");
		
		System.out.println(idenhasmap.size());
		System.out.println(idenhasmap);
		System.out.println(idenhasmap.get(s3));
		System.out.println(idenhasmap.get(s4));//== comparision here
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));
		System.out.println(System.identityHashCode(s4));
		System.out.println(s4.hashCode());					//observe the two diff hashcodes
		
		
		
		
		
		
		
		
		
		
		
	}

}
