package inheritance.basics.session6;

public class Astranaut {
	
	private Planet planetname;



	public Planet getPlanetname() {
		return planetname;
	}

	public void setPlanetname(Planet planetname) {
		this.planetname = planetname;
	}
	
	public static void main(String[] args) {
		Astranaut a=new Astranaut();
		a.setPlanetname(Planet.mars);
		System.out.println(a.getPlanetname());
		System.out.println(a.planetname.getPlanetvalue());
		
		
	}
	
	

}
