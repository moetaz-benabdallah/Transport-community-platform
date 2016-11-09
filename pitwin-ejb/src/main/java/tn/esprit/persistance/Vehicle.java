package tn.esprit.persistance;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Vehicle
 *
 */
@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Vehicle implements Serializable {

	   
	
	private Integer id_Vehicle;
	private String matricule_Vehicle;
	private double tarif_Vehicle;
	private static final long serialVersionUID = 1L;

	public Vehicle() {
		super();
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getId_Vehicle() {
		return this.id_Vehicle;
	}

	public void setId_Vehicle(Integer id_Vehicle) {
		this.id_Vehicle = id_Vehicle;
	}   
	public String getMatricule_Vehicle() {
		return this.matricule_Vehicle;
	}

	public void setMatricule_Vehicle(String matricule_Vehicle) {
		this.matricule_Vehicle = matricule_Vehicle;
	}   
	public double getTarif_Vehicle() {
		return this.tarif_Vehicle;
	}

	public void setTarif_Vehicle(double tarif_Vehicle) {
		this.tarif_Vehicle = tarif_Vehicle;
		
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((id_Vehicle == null) ? 0 : id_Vehicle.hashCode());
		result = prime
				* result
				+ ((matricule_Vehicle == null) ? 0 : matricule_Vehicle
						.hashCode());
		long temp;
		temp = Double.doubleToLongBits(tarif_Vehicle);
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
		Vehicle other = (Vehicle) obj;
		if (id_Vehicle == null) {
			if (other.id_Vehicle != null)
				return false;
		} else if (!id_Vehicle.equals(other.id_Vehicle))
			return false;
		if (matricule_Vehicle == null) {
			if (other.matricule_Vehicle != null)
				return false;
		} else if (!matricule_Vehicle.equals(other.matricule_Vehicle))
			return false;
		if (Double.doubleToLongBits(tarif_Vehicle) != Double
				.doubleToLongBits(other.tarif_Vehicle))
			return false;
		return true;
	}
	
	
   
}
