package mybasics.session15.threads.theatre;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Theatre {
	
	private long cinematickets1=20;
	private long cinematickets2=20;
	
	private final Lock lock=new ReentrantLock();
	
	public long getCinematickets1() {
		return cinematickets1;
	}
	public void setCinematickets1(long cinematickets1) {
		this.cinematickets1 = cinematickets1;
	}
	public long getCinematickets2() {
		return cinematickets2;
	}
	public void setCinematickets2(long cinematickets2) {
		this.cinematickets2 = cinematickets2;
	}
	
	public void sellTicketsforCinema1(long count)
	{
		lock.lock();
		if(count<cinematickets1)
			cinematickets1=cinematickets1-count;
		lock.unlock();
	}
	
	public void sellTicketsforCinema2(long count)
	{
		lock.lock();
		if(count<cinematickets2)
			cinematickets2=cinematickets2-count;
		lock.unlock();
	}
	
	public synchronized void returnTicketsforCinema1(int count)
	{
		
			cinematickets1=cinematickets1+count;
	}

	public void returnTicketsforCinema2(int count) {
		synchronized (lock) {
				cinematickets2=cinematickets2+count;
		}
		
	}
	


}
