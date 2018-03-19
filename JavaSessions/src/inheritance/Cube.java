package inheritance;

public class Cube extends Polygon implements Pi
{
	private int radius;
	

	public Cube(int noofsides, int radius) {
		super(noofsides);
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public double findarea() {
	double area;
	area=(4/3)*PI*radius*radius*radius;
		return area;
	}

	@Override
	public double findperimeter() {
		double perimeter;
		
		perimeter=4*PI*radius;
		return perimeter;
		
		
	}

	@Override
	public double area1() {
		// TODO Auto-generated method stub
		return 0;
	}


	



	

}
