package mybasics.session8.list;

public class Students implements Comparable<Students>
{
	private String name;
	private String id;
	public Students(String name, String id) {
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
		return "Students [name=" + name + ", id=" + id + "]";
	}
	@Override
	public boolean equals(Object o) {
		Students s=(Students)o;
		return this.getId().equals(s.getId());
	}
//	@Override
	public int compareTo(Students o) {
		
		return this.getName().compareTo(o.getName());
	}
	
	
	
	
	

}
