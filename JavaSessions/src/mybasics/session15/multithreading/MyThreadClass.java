package mybasics.session15.multithreading;

public class MyThreadClass extends Thread{
	
	@Override
	public void run() {
		System.out.println("i m runng");
		super.run();
	}

}
