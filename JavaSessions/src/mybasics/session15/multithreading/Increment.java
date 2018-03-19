package mybasics.session15.multithreading;

public class Increment implements Runnable{
	Calculator calculator;


	public Increment(Calculator cal) {
		 this.calculator=cal;
		
	}
	
	
	@Override
	public void run() {
		calculator.increment();
	}
	
	

}
