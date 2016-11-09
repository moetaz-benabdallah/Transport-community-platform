package tn.esprit.persistance;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Reclamation
 *
 */
@Entity

public class Reclamation implements Serializable {

	   
	
	private Integer id_Reclamation;
	private Date dateRec_Reclamation;
	private String sujet_Reclamation;
	private String message_Reclamation;
	private Customer cutomer;
	private static final long serialVersionUID = 1L;

	public Reclamation() {
		super();
	}   
	public Reclamation(Integer id_Reclamation,Date dateRec_Reclamation,String sujet_Reclamation,String message_Reclamation,Customer cutomer) {
		super();
		this.id_Reclamation=id_Reclamation;
		this.dateRec_Reclamation=dateRec_Reclamation;
		this.sujet_Reclamation=sujet_Reclamation;
		this.message_Reclamation=message_Reclamation;
		this.cutomer=cutomer;
	}  
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getId_Reclamation() {
		return this.id_Reclamation;
	}

	public void setId_Reclamation(Integer id_Reclamation) {
		this.id_Reclamation = id_Reclamation;
	}   
	public Date getDateRec_Reclamation() {
		return this.dateRec_Reclamation;
	}

	public void setDateRec_Reclamation(Date dateRec_Reclamation) {
		this.dateRec_Reclamation = dateRec_Reclamation;
	}   
	public String getSujet_Reclamation() {
		return this.sujet_Reclamation;
	}

	public void setSujet_Reclamation(String sujet_Reclamation) {
		this.sujet_Reclamation = sujet_Reclamation;
	}   
	public String getMessage_Reclamation() {
		return this.message_Reclamation;
	}

	public void setMessage_Reclamation(String message_Reclamation) {
		this.message_Reclamation = message_Reclamation;
	}
	
	@ManyToOne
	public Customer getCustomer(){
		return cutomer;
	}
	
	public void setCustomer(Customer customer){
		this.cutomer = customer;
	}
   
	@Override
	public String toString()
	{return "id_Reclamation = "+id_Reclamation+" Date_reclamation = "+dateRec_Reclamation;
		
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cutomer == null) ? 0 : cutomer.hashCode());
		result = prime
				* result
				+ ((dateRec_Reclamation == null) ? 0 : dateRec_Reclamation
						.hashCode());
		result = prime * result
				+ ((id_Reclamation == null) ? 0 : id_Reclamation.hashCode());
		result = prime
				* result
				+ ((message_Reclamation == null) ? 0 : message_Reclamation
						.hashCode());
		result = prime
				* result
				+ ((sujet_Reclamation == null) ? 0 : sujet_Reclamation
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
		Reclamation other = (Reclamation) obj;
		if (cutomer == null) {
			if (other.cutomer != null)
				return false;
		} else if (!cutomer.equals(other.cutomer))
			return false;
		if (dateRec_Reclamation == null) {
			if (other.dateRec_Reclamation != null)
				return false;
		} else if (!dateRec_Reclamation.equals(other.dateRec_Reclamation))
			return false;
		if (id_Reclamation == null) {
			if (other.id_Reclamation != null)
				return false;
		} else if (!id_Reclamation.equals(other.id_Reclamation))
			return false;
		if (message_Reclamation == null) {
			if (other.message_Reclamation != null)
				return false;
		} else if (!message_Reclamation.equals(other.message_Reclamation))
			return false;
		if (sujet_Reclamation == null) {
			if (other.sujet_Reclamation != null)
				return false;
		} else if (!sujet_Reclamation.equals(other.sujet_Reclamation))
			return false;
		return true;
	}
	
}
