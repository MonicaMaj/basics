package mybasics.session12.clone;

public class Employee implements Cloneable {
	
	private String name;
	private String id;
	private Address address;
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

	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	protected Employee clone() throws CloneNotSupportedException {
		Employee emp=(Employee)super.clone();
		emp.address=new Address();
		emp.address.setCity(this.getAddress().getCity());
		return emp ;
	}
	
	
	

}
