package in.ashokit.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.mvc.condition.ProducesRequestCondition;

import in.ashokit.request.Passenger;
import in.ashokit.response.Ticket;
import in.ashokit.service.BookingService;

@Controller
public class BookingRestController {
	
	@Autowired
	private BookingService service;
	
	//method to book ticket (post)
	@PostMapping("/ticket")
	//value="/ticket",
	//consumes = {"appication/json"},
	//produces = {"application/json"}
	
	public ResponseEntity<Ticket> ticketBooking(@RequestBody Passenger passenger){
		System.out.println(passenger);
		Ticket ticket = service.Bookticket(passenger);
		return new ResponseEntity<>(ticket,HttpStatus.CREATED);
		
	}
        //method to 
	@GetMapping(
			value="/ticket/{ticketNum}"
			)
	public Ticket getticketByNum(@PathVariable Integer ticketNum) {
		return service.getticket(ticketNum);
	}
	
	
	
	
	
	
	
	
	
	
	
}
