package inheritance.basics.session6;

public class Vendingmachine {
	
	private Denominations denomination;

	
	public Denominations getDenomination() {
		return denomination;
	}


	public void setDenomination(Denominations denomination) {
		this.denomination = denomination;
	}


	public static void main(String[] args) {
		
	Vendingmachine vm=new Vendingmachine();
	vm.setDenomination(Denominations.dime);
	System.out.println(vm.getDenomination());
	System.out.println(vm.denomination.getDenomvalue());
	
	}

}
