package inheritance;

public abstract class Polygon {

	private int noofsides;
	
	public Polygon(int noofsides) {
		super();
		this.noofsides = noofsides;
	}
	public int getNoofsides() {
		return noofsides;
	}
	public void setNoofsides(int noofsides) {
		this.noofsides = noofsides;
	}
	public abstract double findarea();
	public abstract double  findperimeter();
	
	
	
	

}
