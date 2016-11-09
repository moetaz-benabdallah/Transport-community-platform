package tn.esprit.persistance;

import java.io.Serializable;
import java.lang.Integer;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Reservation
 *
 */
@Entity

public class Reservation implements Serializable {

	   
	
	private Integer id_Reservation;
	private Date date_Reservation;
	private double prix_Reservation;
	private Itinerary itinerary;
	private	Customer customer;
	private static final long serialVersionUID = 1L;

	public Reservation() {
		super();
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getId_Reservation() {
		return this.id_Reservation;
	}

	public void setId_Reservation(Integer id_Reservation) {
		this.id_Reservation = id_Reservation;
	}   
	public Date getDate_Reservation() {
		return this.date_Reservation;
	}

	public void setDate_Reservation(Date date_Reservation) {
		this.date_Reservation = date_Reservation;
	}   
	public double getPrix_Reservation() {
		return this.prix_Reservation;
	}

	public void setPrix_Reservation(double prix_Reservation) {
		this.prix_Reservation = prix_Reservation;
	}
	@ManyToOne
	public Itinerary getItinerary() {
		return itinerary;
	}
	public void setItinerary(Itinerary itinerary) {
		this.itinerary = itinerary;
	}
	@ManyToOne
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	@Override
	public String toString()
	{
		return id_Reservation+" "+prix_Reservation+" ";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((customer == null) ? 0 : customer.hashCode());
		result = prime
				* result
				+ ((date_Reservation == null) ? 0 : date_Reservation.hashCode());
		result = prime * result
				+ ((id_Reservation == null) ? 0 : id_Reservation.hashCode());
		result = prime * result
				+ ((itinerary == null) ? 0 : itinerary.hashCode());
		long temp;
		temp = Double.doubleToLongBits(prix_Reservation);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reservation other = (Reservation) obj;
		if (customer == null) {
			if (other.customer != null)
				return false;
		} else if (!customer.equals(other.customer))
			return false;
		if (date_Reservation == null) {
			if (other.date_Reservation != null)
				return false;
		} else if (!date_Reservation.equals(other.date_Reservation))
			return false;
		if (id_Reservation == null) {
			if (other.id_Reservation != null)
				return false;
		} else if (!id_Reservation.equals(other.id_Reservation))
			return false;
		if (itinerary == null) {
			if (other.itinerary != null)
				return false;
		} else if (!itinerary.equals(other.itinerary))
			return false;
		if (Double.doubleToLongBits(prix_Reservation) != Double
				.doubleToLongBits(other.prix_Reservation))
			return false;
		return true;
	}
   
	
}
