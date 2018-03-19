package mybasics.session17.jdbc.relationships;

import java.util.ArrayList;
import java.util.List;

public class Recepie {
	private int rec_id;
	private String rec_name;
	private List<Ingredients> inglist=new ArrayList<Ingredients>();
	
	public int getRec_id() {
		return rec_id;
	}
	public void setRec_id(int rec_id) {
		this.rec_id = rec_id;
	}
	public String getRec_name() {
		return rec_name;
	}
	public void setRec_name(String rec_name) {
		this.rec_name = rec_name;
	}
	
	public List<Ingredients> getInglist() {
		return inglist;
	}
	public void setInglist(List<Ingredients> inglist) {
		this.inglist = inglist;
	}
	@Override
	public String toString() {
		return "Recepie [rec_id=" + rec_id + ", rec_name=" + rec_name + ", inglist=" + inglist + "]";
	}


	

}
