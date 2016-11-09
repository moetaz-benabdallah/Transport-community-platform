package tn.esprit.persistance;

import java.io.Serializable;
import java.lang.Integer;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Planning
 *
 */
@Entity

public class Planning implements Serializable {

	   
	
	private Integer id_Planning;
	private Date dateDepart_Planning;
	private Date dateArrivee_Planning;
	private Itinerary itinerary;
	private Vehicle vehicle;
	private static final long serialVersionUID = 1L;

	public Planning() {
		super();
	}   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getId_Planning() {
		return this.id_Planning;
	}

	public void setId_Planning(Integer id_Planning) {
		this.id_Planning = id_Planning;
	}   
	public Date getDateDepart_Planning() {
		return this.dateDepart_Planning;
	}

	public void setDateDepart_Planning(Date dateDepart_Planning) {
		this.dateDepart_Planning = dateDepart_Planning;
	}   
	public Date getDateArrivee_Planning() {
		return this.dateArrivee_Planning;
	}

	public void setDateArrivee_Planning(Date dateArrivee_Planning) {
		this.dateArrivee_Planning = dateArrivee_Planning;
	}
	@ManyToOne
	public Itinerary getItinerary() {
		return itinerary;
	}
	public void setItinerary(Itinerary itinerary) {
		this.itinerary = itinerary;
	}
	@ManyToOne
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((dateArrivee_Planning == null) ? 0 : dateArrivee_Planning
						.hashCode());
		result = prime
				* result
				+ ((dateDepart_Planning == null) ? 0 : dateDepart_Planning
						.hashCode());
		result = prime * result
				+ ((id_Planning == null) ? 0 : id_Planning.hashCode());
		result = prime * result
				+ ((itinerary == null) ? 0 : itinerary.hashCode());
		result = prime * result + ((vehicle == null) ? 0 : vehicle.hashCode());
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
		Planning other = (Planning) obj;
		if (dateArrivee_Planning == null) {
			if (other.dateArrivee_Planning != null)
				return false;
		} else if (!dateArrivee_Planning.equals(other.dateArrivee_Planning))
			return false;
		if (dateDepart_Planning == null) {
			if (other.dateDepart_Planning != null)
				return false;
		} else if (!dateDepart_Planning.equals(other.dateDepart_Planning))
			return false;
		if (id_Planning == null) {
			if (other.id_Planning != null)
				return false;
		} else if (!id_Planning.equals(other.id_Planning))
			return false;
		if (itinerary == null) {
			if (other.itinerary != null)
				return false;
		} else if (!itinerary.equals(other.itinerary))
			return false;
		if (vehicle == null) {
			if (other.vehicle != null)
				return false;
		} else if (!vehicle.equals(other.vehicle))
			return false;
		return true;
	}
   
}
