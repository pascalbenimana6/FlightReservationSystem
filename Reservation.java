package edu.miu.cs.cs401.project.domain;

import java.util.List;
import java.util.Objects;

public class Reservation {
	private String reservationId;
	private String reservationCode;
	private List<Passenger> passengers;
	
	//private fli
	
	public void makeReservation() {
		
	}
	public Reservation(String reservationId, String reservationCode, List<Passenger> passengers) {
		this.reservationId = reservationId;
		this.reservationCode = reservationCode;
		this.passengers = passengers;
	}
	
	public String getReservationId() {
		return reservationId;
	}
	public void setReservationId(String reservationId) {
		this.reservationId = reservationId;
	}
	public String getReservationCode() {
		return reservationCode;
	}
	public void setReservationCode(String reservationCode) {
		this.reservationCode = reservationCode;
	}
	public List<Passenger> getPassengers() {
		return passengers;
	}
	public void setPassengers(List<Passenger> passengers) {
		this.passengers = passengers;
	}
	public void confirmReservation() {
		
	}
	@Override
	public int hashCode() {
		return Objects.hash(passengers, reservationCode, reservationId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Reservation))
			return false;
		Reservation other = (Reservation) obj;
		return Objects.equals(passengers, other.passengers) && Objects.equals(reservationCode, other.reservationCode)
				&& Objects.equals(reservationId, other.reservationId);
	}
		
	
}
