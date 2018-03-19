package mybasics.session11.serializationdeserailazation;

import java.io.Serializable;

public class Employee implements Serializable{

	private static final long serialVersionUID = 1L;
	private String name;
	private String id;
	private String address;
	private transient String  phnnum;
	private String state;
	private Address addressoj;

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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getPhnnum() {
		return phnnum;
	}
	public void setPhnnum(String phnnum) {
		this.phnnum = phnnum;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Address getAddressoj() {
		return addressoj;
	}
	public void setAddressoj(Address addressoj) {
		this.addressoj = addressoj;
	}
	
	

}
