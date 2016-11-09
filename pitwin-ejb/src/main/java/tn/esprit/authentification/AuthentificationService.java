package tn.esprit.authentification;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import tn.esprit.persistance.Person;

/**
 * Session Bean implementation class AuthentificationService
 */
@Stateless
@LocalBean
public class AuthentificationService implements AuthentificationServiceRemote, AuthentificationServiceLocal {

	@PersistenceContext
	   private EntityManager em;
	
    public AuthentificationService() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public Person connecter(String login, String password) {
		
String req="select p from Person p where p.login_Person=:login AND p.password_Person=:password";
	Query query=em.createQuery(req);
	
	query.setParameter("login", login);
query.setParameter("password",password);
	Person p=(Person)	query.getSingleResult();
	
return p;
		
	}

}
