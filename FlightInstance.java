package Model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class FlightInstance {

	private int id;
	private LocalDate flightDate;
	private List<Passenger> passenger = new ArrayList<>();
	private List<Pilots> pilots = new ArrayList<>();
	private List<Crew> crew = new ArrayList();
	private Flight flight;

	public FlightInstance(int id, LocalDate flightDate, List<Passenger> passenger, List<Pilots> pilots, List<Crew> crew,
			Flight flight) {
		this.id = id;
		this.flightDate = flightDate;
		this.passenger = passenger;
		this.pilots = pilots;
		this.crew = crew;
		this.flight = flight;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getFlightDate() {
		return flightDate;
	}

	public void setFlightDate(LocalDate flightDate) {
		this.flightDate = flightDate;
	}

	public List<Passenger> getPassenger() {
		return passenger;
	}

	public void setPassenger(List<Passenger> passenger) {
		this.passenger = passenger;
	}

	public List<Pilots> getPilots() {
		return pilots;
	}

	public void setPilots(List<Pilots> pilots) {
		this.pilots = pilots;
	}

	public List<Crew> getCrew() {
		return crew;
	}

	public void setCrew(List<Crew> crew) {
		this.crew = crew;
	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

}
