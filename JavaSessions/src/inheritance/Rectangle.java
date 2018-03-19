package inheritance;

public class Rectangle extends Polygon
{

	private int length;
	private int breadth;

	
		public Rectangle(int noofsides, int length, int breadth) {
		super(noofsides);
		this.length = length;
		this.breadth = breadth;
	}

		public int getLength() {
			return length;
		}

		public void setLength(int length) {
			this.length = length;
		}

		public int getBreadth() {
			return breadth;
		}

		public void setBreadth(int breadth) {
			this.breadth = breadth;
		}

		@Override
		public double findarea() {
		int area;
		area=length*breadth;
			return area;
		}

		@Override
		public double findperimeter() {
			int perimeter;
			perimeter=2*(length+breadth);
			return perimeter;
		}
		
		

	

}
