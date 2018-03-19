package inheritance;

public class Main {
	
	public static void main(String[] args) {
		
		Polygon p1=new Cube(6, 3);
		Polygon p2=new Square(4, 6);
		Polygon p3=new Rectangle(4, 4, 6);
		
		System.out.println("Polygon family");
		System.out.println("1.cube");
		System.out.println("no of side"+p1.getNoofsides());
		System.out.println("Value of pi is"+Pi.PI);
		double cubearea=p1.findarea();
		System.out.println(cubearea);
		double cubeperimeter=p1.findperimeter();
		System.out.println(cubeperimeter);
		
		System.out.println();
		System.out.println("1.square");
		double squarearea=p2.findarea();
		System.out.println(squarearea);
		double squareperimeter=p2.findperimeter();
		System.out.println(squareperimeter);
		
		System.out.println();
		System.out.println("1.rectangle");
		double rectarea=p3.findarea();
		System.out.println(rectarea);
		double rectperimeter=p3.findperimeter();
		System.out.println(rectperimeter);
		System.out.println(Math.PI);
		
		
		Pi p=new Square(4, 2);
		double squarearea1=p.area1();
		System.out.println(squarearea1);
		
		
	 
	 
	 
	 


	}

}
