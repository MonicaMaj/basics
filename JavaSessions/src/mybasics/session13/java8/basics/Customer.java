package mybasics.session13.java8.basics;

public class Customer {

	private String name;
	private String city;
	
	
	public Customer(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", city=" + city + "]";
	}
	
	
	
}
