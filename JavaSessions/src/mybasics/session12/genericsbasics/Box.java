package mybasics.session12.genericsbasics;

public class Box {
	Object object;

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

	@Override
	public String toString() {
		return "Box [object=" + object + "]";
	}
	
	
	

}
