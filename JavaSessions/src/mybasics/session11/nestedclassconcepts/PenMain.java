package mybasics.session11.nestedclassconcepts;
//immutable class
public class PenMain {
	public static void main(String[] args) {
		
		Shop s1=new Shop("monicashop"); 
		Pen p1=new Pen("monica", s1);
		
		String s=new String("hello");
		String immutble=s.concat("hii");
		System.out.println(immutble);
		
		//even though th evalue is changes displays the old one only
		p1.getShop().setShopname("monashop");
		
		System.out.println(p1);
		
	}

}
