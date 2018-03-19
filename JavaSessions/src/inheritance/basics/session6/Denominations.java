package inheritance.basics.session6;

public enum Denominations {
	
	nickel(5),
	dime(10),
	quarter(25);
	
	private int denomvalue;
	

	private Denominations(int denomvalue) {
		this.denomvalue = denomvalue;
	}

	public int getDenomvalue() {
		return denomvalue;
	}

	public void setDenomvalue(int denomvalue) {
		this.denomvalue = denomvalue;
	}


	

}
