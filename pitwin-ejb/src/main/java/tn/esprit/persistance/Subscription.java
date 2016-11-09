package tn.esprit.persistance;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Subscription
 *
 */
@Entity

public class Subscription implements Serializable {

	   
	
	private Integer id_Subscripton;
	private Date date_Subscripton;
	private String numCarte_Subscripton;
	private Customer customer;
	private Administrator administrator;
	private static final long serialVersionUID = 1L;

	public Subscription() {
		super();
	}   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getId_Subscripton() {
		return this.id_Subscripton;
	}

	public void setId_Subscripton(Integer id_Subscripton) {
		this.id_Subscripton = id_Subscripton;
	}   
	public Date getDate_Subscripton() {
		return this.date_Subscripton;
	}

	public void setDate_Subscripton(Date date_Subscripton) {
		this.date_Subscripton = date_Subscripton;
	}   
	public String getNumCarte_Subscripton() {
		return this.numCarte_Subscripton;
	}

	public void setNumCarte_Subscripton(String numCarte_Subscripton) {
		this.numCarte_Subscripton = numCarte_Subscripton;
	}
	@ManyToOne
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	@ManyToOne
	public Administrator getAdministrator() {
		return administrator;
	}
	public void setAdministrator(Administrator administrator) {
		this.administrator = administrator;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((administrator == null) ? 0 : administrator.hashCode());
		result = prime * result
				+ ((customer == null) ? 0 : customer.hashCode());
		result = prime
				* result
				+ ((date_Subscripton == null) ? 0 : date_Subscripton.hashCode());
		result = prime * result
				+ ((id_Subscripton == null) ? 0 : id_Subscripton.hashCode());
		result = prime
				* result
				+ ((numCarte_Subscripton == null) ? 0 : numCarte_Subscripton
						.hashCode());
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
		Subscription other = (Subscription) obj;
		if (administrator == null) {
			if (other.administrator != null)
				return false;
		} else if (!administrator.equals(other.administrator))
			return false;
		if (customer == null) {
			if (other.customer != null)
				return false;
		} else if (!customer.equals(other.customer))
			return false;
		if (date_Subscripton == null) {
			if (other.date_Subscripton != null)
				return false;
		} else if (!date_Subscripton.equals(other.date_Subscripton))
			return false;
		if (id_Subscripton == null) {
			if (other.id_Subscripton != null)
				return false;
		} else if (!id_Subscripton.equals(other.id_Subscripton))
			return false;
		if (numCarte_Subscripton == null) {
			if (other.numCarte_Subscripton != null)
				return false;
		} else if (!numCarte_Subscripton.equals(other.numCarte_Subscripton))
			return false;
		return true;
	}
   
}
