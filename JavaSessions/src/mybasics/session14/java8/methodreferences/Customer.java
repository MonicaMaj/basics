package mybasics.session14.java8.methodreferences;

public class Customer {

	private String name;
	private String city;
	
	
	public Customer(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}
	public Customer() {
		// TODO Auto-generated constructor stub
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
	public static int comparecustomers(Customer o1,Customer o2)
	{
		return o1.getName().compareTo(o2.getName());
	}
	
	public  int nonstaticcomparecustomers(Customer o1,Customer o2)
	{
		return o1.getName().compareTo(o2.getName());
	}
	
	

}
