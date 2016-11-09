package tn.esprit.business;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;





import javax.persistence.Query;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import tn.esprit.persistance.Customer;
import tn.esprit.persistance.Person;
import tn.esprit.persistance.Subscription;

/**
 * Session Bean implementation class AdministratorSubscription
 */
@Stateless
@LocalBean
public class AdministratorSubscription implements AdministratorSubscriptionRemote, AdministratorSubscriptionLocal {

	@PersistenceContext
	private EntityManager em;
	
    public AdministratorSubscription() {
        
    	
    }

	@Override
	public List<Subscription> viewSubscription() {
		return em
				.createQuery("select s from Subscription s", Subscription.class)
				.getResultList();
	}

	@Override
	public List<Subscription> view_subsc_expir_dates(int days) {
		return em.createQuery(
			    "select s from Subscription s "
			    + "where 365 - datediff(curdate(), s.date_Subscripton) < "+days, Subscription.class)
			    .getResultList() ;
	}

	@Override
	public String addSubscription(Subscription sub) {
		em.persist(sub);
		return "Ajout avec succes";
	}

	@Override
	public String inscriptionCustomer(Person customer) {
		em.persist(customer);
		return "Ajout avec succes";
	}

	@Override
	public Subscription rechercheSubscParIdCustomer(int idCustomer) {
		
		try{
		Query q = em.createQuery("SELECT s FROM Subscription s WHERE s.customer.id_Person = :idCustomer");

		// set the parameter
		q.setParameter("idCustomer", idCustomer);
		return (Subscription) q.getSingleResult();
		}catch(NoResultException ex){
			return new Subscription();
		}
	}

	@Override
	public String suppSubscription(int id) {
		Query query = em.createQuery("DELETE FROM Subscription s WHERE s.id_Subscripton = :idSub");
		int deletedCount = query.setParameter("idSub", id).executeUpdate();
		
		if(deletedCount > 0)
			return "Suppression avec succes";
		else return "Error";
	}

	@Override
	public String getMailByNumCarte(String numCarte) {
		
		Query q = em.createQuery("SELECT s FROM Subscription s WHERE s.numCarte_Subscripton = :num");
		q.setParameter("num", numCarte);
		Subscription sub = (Subscription) q.getSingleResult();
		
		Query query = em.createQuery("SELECT s FROM Customer s WHERE s.id_Person = :num");
		query.setParameter("num", sub.getCustomer().getId_Person());
		Person pers = (Person) query.getSingleResult();
		
		return pers.getEmail_Person();
	}
	
	@Override
	public Customer getp(Customer p){
		Customer pers = null;
		try {
			Query query = em.createQuery("SELECT s FROM Customer s WHERE s.email_Person = :email");
			query.setParameter("email", p.getEmail_Person());
			pers = (Customer) query.getSingleResult();
		} catch (Exception e) {
			return null;
		}
		
		return pers;
	}
	

	@Override
	public int getIdUserByMail(Customer customer) {
		
		Customer p = null;
		Customer met = getp(customer);
	
			if(met == null){
				em.persist(customer);
				Query query2 = em.createQuery("SELECT s FROM Customer s WHERE s.email_Person = :email");
				query2.setParameter("email", customer.getEmail_Person());
				p = (Customer) query2.getSingleResult();
				return p.getId_Person();
			}
			else{
			return met.getId_Person();
		}
		

	}

	
}
