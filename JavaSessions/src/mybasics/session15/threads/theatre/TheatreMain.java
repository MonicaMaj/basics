package mybasics.session15.threads.theatre;

public class TheatreMain {
	public static void main(String[] args) throws InterruptedException {
		
		Theatre theatre=new Theatre();
		TicketingOffice1 offc1=new TicketingOffice1(theatre);
		TicketingOffice1 offc2=new TicketingOffice1(theatre);
		Thread t1=new Thread(offc1);
		Thread t2=new Thread(offc2);
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println(theatre.getCinematickets1());
		System.out.println(theatre.getCinematickets2());
	}

}
