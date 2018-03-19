package mybasics.session11.nestedclassconcepts;
//singletonclass
public class Book {
	private String name;
	private String author;
	
	//private static Book book=new Book();//1st way
	private static Book book;//2nd way
	 private Book()
	{
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	public static Book getinstanceof()
	{//2ND WAY 
		if(book!=null)
			book= new Book();	
		
		
		return book;//1st way
	}
	
}
