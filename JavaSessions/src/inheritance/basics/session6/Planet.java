package inheritance.basics.session6;

public enum Planet {
	mars(1),
	venus(2),
	earth(3),
	mercury(4),
	jupiter(5),
	pluto(9);
	
	private int planetvalue;
	


	private Planet(int planetvalue) {
		this.planetvalue = planetvalue;
	}



	public int getPlanetvalue() {
		return planetvalue;
	}



	public void setPlanetvalue(int planetvalue) {
		this.planetvalue = planetvalue;
	}

	
	
	
}
