package tn.esprit.authentification;

import javax.ejb.Local;

import tn.esprit.persistance.Person;

@Local
public interface AuthentificationServiceLocal {
	public Person connecter(String login, String password);	

}
