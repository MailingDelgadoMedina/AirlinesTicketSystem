package com.mailingdelgado.ws.soap;

//import java.math.Integer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.airlinesystem.airlineticket.Airlineticket;
import com.airlinesystem.airlineticket.GetTicket;
import com.airlinesystem.airlineticket.GetTicketResponse;
import com.airlinesystem.airlineticket.PassangerType;
import com.airlinesystem.airlineticket.Ticket;

public class TicketWsImpl implements Airlineticket {
	
	Map<Integer, List<Ticket>> flightTickets = new HashMap<>();

	public void init() {
		List<Ticket> fightTickets = new ArrayList<>();
		Ticket ticket = new Ticket();
		ticket.setId(Integer.valueOf(1));
		ticket.setAirline("JetBlue");
		ticket.setDepartureCity("Fort Lauderdale");
		ticket.setArrivalCity("San Juan");
		ticket.setFlightType("Non-stop");
		ticket.setDepartureDate("12/28/22");
		ticket.setPassanger(passangerType());
		
		
		
		
		
		
		
		fightTickets.add(ticket);
	}
	
	
	private PassangerType passangerType() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public GetTicketResponse getTicket(GetTicket parameters) {
		// TODO Auto-generated method stub
		return null;
	}

}
