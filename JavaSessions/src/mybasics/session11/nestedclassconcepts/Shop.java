package mybasics.session11.nestedclassconcepts;
//immutable class
public class Shop {
	private String shopname;

	public Shop(String shopname) {
		super();
		this.shopname = shopname;
	}

	public String getShopname() {
		return shopname;
	}

	public void setShopname(String shopname) {
		this.shopname = shopname;
	}

	@Override
	public String toString() {
		return "Shop [shopname=" + shopname + "]";
	}

	
}
