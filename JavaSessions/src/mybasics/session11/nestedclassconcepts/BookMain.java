package mybasics.session11.nestedclassconcepts;
//singletonclass
public class BookMain {
	public static void main(String[] args) {
		
		//Book b1=new Book(); private constructor
		//1st way 
			Book b2=Book.getinstanceof();
			
			Book b3=Book.getinstanceof();
			System.out.println(b2==b3);
		
	}

}
