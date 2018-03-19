package mybasics.session15.multithreading;

import java.util.concurrent.TimeUnit;
//we need to synchronize the count variable ow we ll get different outputs 

public class Calculator {

	private int count;
	//add synchronized keyword for consistency
	public synchronized void increment()
	{
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		count=count+1;
	}
	public int getCount() {
		return count;
	}
}

