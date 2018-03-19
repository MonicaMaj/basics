package mybasics.session9.map;

public class Customers implements Comparable<Customers>{
	private String name;
	private int id;
	private String city;
	public Customers(String name, int id, String city) {
		super();
		this.name = name;
		this.id = id;
		this.city = city;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Customers [name=" + name + ", id=" + id + ", city=" + city + "]";
	}
	
	@Override
	public int hashCode() {
		
		return name.hashCode()+city.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
			Customers c= (Customers)obj;
		return this.getName().equals(c.getName()) && this.getCity().equals(c.getCity());
	
	
	}
	@Override
	public int compareTo(Customers o) {
		
		return this.getName().compareTo(o.getName());
	}
	
	
	
}
