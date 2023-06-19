package in.ashokit.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import in.ashokit.request.Passenger;
import in.ashokit.response.Ticket;

@Service
public class BookintServiceImpl implements BookingService {
	
	private Map<Integer, Ticket> ticketesmap = new HashMap<>();
	
	private Integer ticketNum = 1;

	@Override
	public Ticket Bookticket(Passenger passenger) {
		Ticket t = new Ticket();
		BeanUtils.copyProperties(passenger, t);
		t.setTicketcost(550.00);
		t.setStatus("CONFIRMED");
		t.setTicketNumber(ticketNum);
		ticketNum ++;
		
		ticketesmap.put(ticketNum, t);
		return t;
	}

	@Override
	public Ticket getticket(Integer ticketNumber) {
		if(ticketesmap.containsKey(ticketNumber));
		return ticketesmap.get(ticketNumber);
	
	}



}


