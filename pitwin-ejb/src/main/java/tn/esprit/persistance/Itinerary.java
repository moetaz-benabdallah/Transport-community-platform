package tn.esprit.persistance;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Itinerary
 *
 */
@Entity

public class Itinerary implements Serializable {

	   
	
	private Integer id_Itinerary;
	private String ligne_Itinerary;
	private String arret_Itinerary;
	private Integer ordre_Itinerary;
	private static final long serialVersionUID = 1L;

	public Itinerary() {
		super();
	}   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getId_Itinerary() {
		return this.id_Itinerary;
	}

	public void setId_Itinerary(Integer id_Itinerary) {
		this.id_Itinerary = id_Itinerary;
	}   
	public String getLigne_Itinerary() {
		return this.ligne_Itinerary;
	}

	public void setLigne_Itinerary(String ligne_Itinerary) {
		this.ligne_Itinerary = ligne_Itinerary;
	}   
	public String getArret_Itinerary() {
		return this.arret_Itinerary;
	}

	public void setArret_Itinerary(String arret_Itinerary) {
		this.arret_Itinerary = arret_Itinerary;
	}   
	public Integer getOrdre_Itinerary() {
		return this.ordre_Itinerary;
	}

	public void setOrdre_Itinerary(Integer ordre_Itinerary) {
		this.ordre_Itinerary = ordre_Itinerary;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((arret_Itinerary == null) ? 0 : arret_Itinerary.hashCode());
		result = prime * result
				+ ((id_Itinerary == null) ? 0 : id_Itinerary.hashCode());
		result = prime * result
				+ ((ligne_Itinerary == null) ? 0 : ligne_Itinerary.hashCode());
		result = prime * result
				+ ((ordre_Itinerary == null) ? 0 : ordre_Itinerary.hashCode());
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
		Itinerary other = (Itinerary) obj;
		if (arret_Itinerary == null) {
			if (other.arret_Itinerary != null)
				return false;
		} else if (!arret_Itinerary.equals(other.arret_Itinerary))
			return false;
		if (id_Itinerary == null) {
			if (other.id_Itinerary != null)
				return false;
		} else if (!id_Itinerary.equals(other.id_Itinerary))
			return false;
		if (ligne_Itinerary == null) {
			if (other.ligne_Itinerary != null)
				return false;
		} else if (!ligne_Itinerary.equals(other.ligne_Itinerary))
			return false;
		if (ordre_Itinerary == null) {
			if (other.ordre_Itinerary != null)
				return false;
		} else if (!ordre_Itinerary.equals(other.ordre_Itinerary))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Itinerary [id_Itinerary=" + id_Itinerary + ", ligne_Itinerary="
				+ ligne_Itinerary + ", arret_Itinerary=" + arret_Itinerary
				+ ", ordre_Itinerary=" + ordre_Itinerary + "]";
	}
   
}
