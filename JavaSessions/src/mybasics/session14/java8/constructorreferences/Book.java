package mybasics.session14.java8.constructorreferences;

public class Book {
	private String name;
	private String id;
	
	public Book(String id) {
		super();
		this.id = id;
	}

	public Book(String name, String id) {
		super();
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", id=" + id + "]";
	}
	
	
}
