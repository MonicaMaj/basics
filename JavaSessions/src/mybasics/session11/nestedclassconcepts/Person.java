package mybasics.session11.nestedclassconcepts;

public abstract class Person {
	
	private String name;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract void login();
	
	public abstract void logout();

}
