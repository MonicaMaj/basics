package inheritance;

public class Square extends Polygon implements Pi{
	
	
	private int side;


	
	

	public Square(int noofsides, int side) {
		super(noofsides);
		this.side = side;
	}


	public int getSide() {
		return side;
	}


	public void setSide(int side) {
		this.side = side;
	}


	@Override
	public double findarea() {
		int area;
		 area=side*side;
		 return area;
		
	
		
	}

	@Override
	public  double findperimeter() {
		int perimeter;
		perimeter=4*side;
	
		return perimeter;
	}


	@Override
	public double area1() {
		int area;
		 area=side*side;
		 return area;
		
	
		
	}
	
	

	
}
	
	

	
	
	

	


