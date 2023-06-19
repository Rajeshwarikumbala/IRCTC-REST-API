package in.ashokit.service;

import in.ashokit.request.Passenger;
import in.ashokit.response.Ticket;

public interface BookingService {
	
	public Ticket Bookticket(Passenger passenger);
	
	public Ticket getticket(Integer ticketNumber);

}
