package mybasics.session15.multithreading;

public class CalculatorMain {
			public static void main(String[] args) {
					Calculator c=new Calculator();
					Increment runobj=new Increment(c);
					ThreadGroup tgp=new ThreadGroup("mythreadgroup");
					for (int i = 0; i < 10; i++) {
						Thread t=new Thread(tgp, runobj);
						t.start();
					}
					while(true)
					{
						if(tgp.activeCount()==0)
							break;
					}
					System.out.println(c.getCount());
				
				
				
}
}
