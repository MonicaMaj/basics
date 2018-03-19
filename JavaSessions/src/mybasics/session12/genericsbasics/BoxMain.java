package mybasics.session12.genericsbasics;

public class BoxMain {
			public static void main(String[] args) {
				 Box b1=new Box();
				
				 b1.setObject("hi");
				 
				 System.out.println(b1.getObject());
//				 runtime error
//				 		int i=(int) b1.getObject();
//				 	
				 	BoxGeneric<Integer> b2=new BoxGeneric<>();
				 	b2.setT(1);
				 	
				 	BoxGeneric<String> b3=new BoxGeneric<>();
				 	b3.setT("monica");
				
				
				
				
				
				
			}
	
	
	
	
	
	
	
	
	
	
}
