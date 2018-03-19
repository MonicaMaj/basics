package mybasics.practice;
public class Customer {
	private String name;

	public Customer(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
/*	@Override
	public boolean equals(Object obj) {
		Customer c =(Customer) obj;
		return this.getName().equals(c.getName());
	}*/
	


}
