package mybasics.session15.multithreading;

import java.util.concurrent.TimeUnit;

public class MultiThreadingDemo {
	public static void main(String[] args) throws InterruptedException {
		//First Way
		MyThreadClass t1=new MyThreadClass();
		t1.start();
		
		
		//secondway
		MyRunnable mr=new MyRunnable();
		Thread t2=new Thread(mr);
		t2.start();
		t1.join();//makes other threads to wait until current thread is completed
		t2.join();
		TimeUnit.SECONDS.sleep(1);//newer way
		Thread.sleep(1000);//older way
		
		System.out.println("i m running in main");//deomon thread 
		
		
	}

}
