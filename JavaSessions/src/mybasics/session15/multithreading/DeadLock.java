package mybasics.session15.multithreading;

import java.util.concurrent.TimeUnit;

public class DeadLock extends Thread {
	public static void main(String[] args) 
	{
		String resource1="monica";
		String resource2="majiga";
		System.out.println("suer");
		Thread t1=new Thread() {
			@Override
			public void run() {
				synchronized( resource1)
					{
						System.out.println("thread 1: locked resource 1");
					
					try {
						TimeUnit.SECONDS.sleep(1);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					synchronized( resource2)
						{
							System.out.println("thread 1: locked resource 2");
						}
					
				}
			}
				
			
		
		};
		Thread t2=new Thread() {
			@Override
			public void run() {
				synchronized( resource1)
					{
						System.out.println("thread 2: locked resource 1");
					
					try {
						TimeUnit.SECONDS.sleep(1);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					synchronized( resource2)
						{
							System.out.println("thread 2: locked resource 2");
						}
					
					}
					}
			
		
		};
		t1.start();
		t2.start();
		
		
	}
	
			
		}
			
		
