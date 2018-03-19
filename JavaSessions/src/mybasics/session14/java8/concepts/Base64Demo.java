package mybasics.session14.java8.concepts;

import java.util.Base64;

public class Base64Demo {
	public static void main(String[] args) {
		
		String s= "i m monica";
		String encoded=Base64.getEncoder().encodeToString(s.getBytes());
		System.out.println(encoded);
		
		String decoded=new String(Base64.getDecoder().decode(encoded));
		System.out.println(decoded);
		
		
	}

}
