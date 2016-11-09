package tn.esprit.persistance;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Taxi
 *
 */
@Entity

public class Taxi implements Serializable {

	   
	
	private Integer id_Taxi;
	private String matricule_Taxi;
	private static final long serialVersionUID = 1L;

	public Taxi() {
		super();
	}   
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getId_Taxi() {
		return this.id_Taxi;
	}

	public void setId_Taxi(Integer id_Taxi) {
		this.id_Taxi = id_Taxi;
	}   
	public String getMatricule_Taxi() {
		return this.matricule_Taxi;
	}

	public void setMatricule_Taxi(String matricule_Taxi) {
		this.matricule_Taxi = matricule_Taxi;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id_Taxi == null) ? 0 : id_Taxi.hashCode());
		result = prime * result
				+ ((matricule_Taxi == null) ? 0 : matricule_Taxi.hashCode());
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
		Taxi other = (Taxi) obj;
		if (id_Taxi == null) {
			if (other.id_Taxi != null)
				return false;
		} else if (!id_Taxi.equals(other.id_Taxi))
			return false;
		if (matricule_Taxi == null) {
			if (other.matricule_Taxi != null)
				return false;
		} else if (!matricule_Taxi.equals(other.matricule_Taxi))
			return false;
		return true;
	}
   
	
}
