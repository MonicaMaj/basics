package mybasics.session17.jdbc.relationships;

public class Identity {
	private int id;
	private String type;
	private Citizen citizeninfo;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	

	public Citizen getCitizeninfo() {
		return citizeninfo;
	}
	public void setCitizeninfo(Citizen citizeninfo) {
		this.citizeninfo = citizeninfo;
	}
	@Override
	public String toString() {
		return "Identity [id=" + id + ", type=" + type + ", citizeninfo=" + citizeninfo + "]";
	}


	

}
