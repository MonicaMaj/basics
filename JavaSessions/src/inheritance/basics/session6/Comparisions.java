package inheritance.basics.session6;

public class Comparisions {
	public static void main(String[] args) {
		
		Faculty f1=new Faculty("moni", "c47");
		Faculty f2=new Faculty("moni", "c47");
		
		System.out.println(f1==f2);
		System.out.println(f1.equals(f2));
		
		
		System.out.println("ah".compareTo("bh"));
		
	}

}
