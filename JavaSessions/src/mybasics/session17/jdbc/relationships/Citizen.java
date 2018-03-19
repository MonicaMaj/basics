package mybasics.session17.jdbc.relationships;

public class Citizen {
	private int cid;
	private String cname;
	private String cage;
	private Identity idinfo;
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCage() {
		return cage;
	}
	public void setCage(String cage) {
		this.cage = cage;
	}
	

	public Identity getIdinfo() {
		return idinfo;
	}
	public void setIdinfo(Identity idinfo) {
		this.idinfo = idinfo;
	}
	@Override
	public String toString() {
		return "Citizen [cid=" + cid + ", cname=" + cname + ", cage=" + cage + ", idinfo=" + idinfo + "]";
	}
	
	
	
	
	

}
