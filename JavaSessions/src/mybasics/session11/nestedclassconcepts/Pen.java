package mybasics.session11.nestedclassconcepts;
//immutable class
public class Pen {

	private String name;
	private Shop shop;
	
	
	public Pen(String name, Shop shop) {
		super();
		this.name = name;
		this.shop = new Shop(shop.getShopname());
	}
	public String getName() {
		return name;
	}
	public Shop getShop() {
		return new Shop(shop.getShopname());
	}
	@Override
	public String toString() {
		return "Pen [name=" + name + ", shop=" + shop + "]";
	}
	
	
}
