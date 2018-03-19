package mybasics.session17.jdbc.relationships;

import java.util.ArrayList;
import java.util.List;

public class Ingredients {
	private int ing_id;
	private String ing_name;
	private List<Recepie> reclist=new ArrayList<Recepie>();
	
	public int getIng_id() {
		return ing_id;
	}
	public void setIng_id(int ing_id) {
		this.ing_id = ing_id;
	}
	public String getIng_name() {
		return ing_name;
	}
	public void setIng_name(String ing_name) {
		this.ing_name = ing_name;
	}
	
	public List<Recepie> getReclist() {
		return reclist;
	}
	public void setReclist(List<Recepie> reclist) {
		this.reclist = reclist;
	}
	@Override
	public String toString() {
		return "ing_name=" + ing_name;
	}
	
	
	

}
