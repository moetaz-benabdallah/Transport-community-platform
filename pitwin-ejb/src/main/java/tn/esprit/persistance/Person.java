package tn.esprit.persistance;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Person
 *
 */
@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Person implements Serializable {

	   
	
	private Integer id_Person;
	private String nom_Person;
	private String prenom_Person;
	private String cin_Person;
	private String adresse_Person;
	private String email_Person;
	private String telephone_Person;
	private Date dateNaissance_Person;
	private String login_Person;
	private String password_Person;
	private static final long serialVersionUID = 1L;

	public Person() {
		super();
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getId_Person() {
		return this.id_Person;
	}

	public void setId_Person(Integer id_Person) {
		this.id_Person = id_Person;
	}   
	public String getNom_Person() {
		return this.nom_Person;
	}

	public void setNom_Person(String nom_Person) {
		this.nom_Person = nom_Person;
	}   
	public String getPrenom_Person() {
		return this.prenom_Person;
	}

	public void setPrenom_Person(String prenom_Person) {
		this.prenom_Person = prenom_Person;
	}   
	public String getCin_Person() {
		return this.cin_Person;
	}

	public void setCin_Person(String cin_Person) {
		this.cin_Person = cin_Person;
	}   
	public String getAdresse_Person() {
		return this.adresse_Person;
	}

	public void setAdresse_Person(String adresse_Person) {
		this.adresse_Person = adresse_Person;
	}   
	public String getEmail_Person() {
		return this.email_Person;
	}

	public void setEmail_Person(String email_Person) {
		this.email_Person = email_Person;
	}   
	public String getTelephone_Person() {
		return this.telephone_Person;
	}

	public void setTelephone_Person(String telephone_Person) {
		this.telephone_Person = telephone_Person;
	}   
	public Date getDateNaissance_Person() {
		return this.dateNaissance_Person;
	}

	public void setDateNaissance_Person(Date dateNaissance_Person) {
		this.dateNaissance_Person = dateNaissance_Person;
	}   
	public String getLogin_Person() {
		return this.login_Person;
	}

	public void setLogin_Person(String login_Person) {
		this.login_Person = login_Person;
	}   
	public String getPassword_Person() {
		return this.password_Person;
	}

	public void setPassword_Person(String password_Person) {
		this.password_Person = password_Person;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((adresse_Person == null) ? 0 : adresse_Person.hashCode());
		result = prime * result
				+ ((cin_Person == null) ? 0 : cin_Person.hashCode());
		result = prime
				* result
				+ ((dateNaissance_Person == null) ? 0 : dateNaissance_Person
						.hashCode());
		result = prime * result
				+ ((email_Person == null) ? 0 : email_Person.hashCode());
		result = prime * result
				+ ((id_Person == null) ? 0 : id_Person.hashCode());
		result = prime * result
				+ ((login_Person == null) ? 0 : login_Person.hashCode());
		result = prime * result
				+ ((nom_Person == null) ? 0 : nom_Person.hashCode());
		result = prime * result
				+ ((password_Person == null) ? 0 : password_Person.hashCode());
		result = prime * result
				+ ((prenom_Person == null) ? 0 : prenom_Person.hashCode());
		result = prime
				* result
				+ ((telephone_Person == null) ? 0 : telephone_Person.hashCode());
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
		Person other = (Person) obj;
		if (adresse_Person == null) {
			if (other.adresse_Person != null)
				return false;
		} else if (!adresse_Person.equals(other.adresse_Person))
			return false;
		if (cin_Person == null) {
			if (other.cin_Person != null)
				return false;
		} else if (!cin_Person.equals(other.cin_Person))
			return false;
		if (dateNaissance_Person == null) {
			if (other.dateNaissance_Person != null)
				return false;
		} else if (!dateNaissance_Person.equals(other.dateNaissance_Person))
			return false;
		if (email_Person == null) {
			if (other.email_Person != null)
				return false;
		} else if (!email_Person.equals(other.email_Person))
			return false;
		if (id_Person == null) {
			if (other.id_Person != null)
				return false;
		} else if (!id_Person.equals(other.id_Person))
			return false;
		if (login_Person == null) {
			if (other.login_Person != null)
				return false;
		} else if (!login_Person.equals(other.login_Person))
			return false;
		if (nom_Person == null) {
			if (other.nom_Person != null)
				return false;
		} else if (!nom_Person.equals(other.nom_Person))
			return false;
		if (password_Person == null) {
			if (other.password_Person != null)
				return false;
		} else if (!password_Person.equals(other.password_Person))
			return false;
		if (prenom_Person == null) {
			if (other.prenom_Person != null)
				return false;
		} else if (!prenom_Person.equals(other.prenom_Person))
			return false;
		if (telephone_Person == null) {
			if (other.telephone_Person != null)
				return false;
		} else if (!telephone_Person.equals(other.telephone_Person))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Person [id_Person=" + id_Person + ", nom_Person=" + nom_Person
				+ ", prenom_Person=" + prenom_Person + ", cin_Person="
				+ cin_Person + ", adresse_Person=" + adresse_Person
				+ ", email_Person=" + email_Person + ", telephone_Person="
				+ telephone_Person + ", dateNaissance_Person="
				+ dateNaissance_Person + ", login_Person=" + login_Person
				+ ", password_Person=" + password_Person + "]";
	}
   
}
