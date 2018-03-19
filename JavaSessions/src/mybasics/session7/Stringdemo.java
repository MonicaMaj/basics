package mybasics.session7;

public class Stringdemo {
	public static void main(String[] args) {
		
		String s1="hello";
		String s2="WORLD";
		System.out.println(s1+s2);
		System.out.println(s1.concat(s2));
		
		//stringbuffer class
		StringBuffer sb1=new StringBuffer("hello");
		sb1.append("world");
		String s3=sb1.toString();
		System.out.println(s3);
		System.out.println(sb1.reverse());
		
		//to print in a character array
		
		char [] c=s1.toCharArray();
		for(char ch: c)
		{
		System.out.println(ch);
		}
		
		System.out.println(s1.length());
		
		String s5=s1.substring(1, 3);
		System.out.println(s5);
		System.out.println(s1.charAt(1));
		System.out.println(s1.charAt(2));
		System.out.println(s1.indexOf('l'));
		System.out.println(s1.lastIndexOf('l'));
		String s6=String.valueOf(10);
		System.out.println(s6);
		String s7=" hello world    how ";
		String [] s=s7.split(" ");
		for(String split: s)
		{
			System.out.println(split);
		}
		
		String trim=s7.trim();
		System.out.println(trim);
		
		
				
	}

}
