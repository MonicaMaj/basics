package mybasics.session15.threads.theatre;

public class TicketingOffice1 implements Runnable{

	private Theatre theatre;
	

	public TicketingOffice1(Theatre theatre) {
		super();
		this.theatre = theatre;
	}


	@Override
	public void run() {
		theatre.sellTicketsforCinema1(2);
			theatre.sellTicketsforCinema2(4);
			theatre.returnTicketsforCinema1(1);
		theatre.returnTicketsforCinema2(3);

		
		
	}
	
}
