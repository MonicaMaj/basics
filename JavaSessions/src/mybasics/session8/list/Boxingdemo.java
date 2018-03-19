package mybasics.session8.list;

import javax.xml.bind.ParseConversionEvent;

public class Boxingdemo {
	public static void main(String[] args) {
		int i=5;
		
		//older versions
		/*Integer q=new Integer(i);
		System.out.println(q);*/
		
		Integer q=i;
		System.out.println(q);
		
		int r=q;//unboxing
		System.out.println(r);
		
		//conversion string to int
		String s="9";
	int in=Integer.parseInt(s);
	System.out.println(in);
	
	
	//int to string(2 methods)
	String snew=String.valueOf(i);//for int
	System.out.println(snew);
	Integer intg=7;
	
	String snew1=String.valueOf(intg);//for Integer
	System.out.println(snew1);
	
	String seven=intg.toString();//for Integer
		System.out.println(seven);
		
		//String seven1=i.toString();//for int:Error we cannot invoke to string method to primitive types.
		
		String latest="1";
		Integer im=Integer.valueOf(latest);
		System.out.println(im);
		
		
		
	}

}
