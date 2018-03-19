package mybasics.session14.java8.constructorreferences;

public class BookMain {
	public static void main(String[] args) {
		// lamda notation with id
		BookwithId bid=(id)-> {return new Book(id);};
		Book b1=bid.bookwithid("47");
		System.out.println(b1.getId());
		
		//constructor references
		//constrctr references with bookwithid interface and assuring to call which constructor in them
		BookwithId bid1= Book:: new;
		Book b2=bid1.bookwithid("45");
		System.out.println(b2.getId());
		
		//lamda notation with id and name
		BookwithName bname= (name,id)-> {return new Book(name, id);};
		Book b3=bname.bookwithid("mybook", "34");
		System.out.println(b3.getId());
		System.out.println(b3.getName());
		
		//constructor references
		BookwithName name=Book::new;
		Book b4=name.bookwithid("mybook", "35");
		System.out.println(b4.getId());
		System.out.println(b4.getName());
		
		
	}

}
