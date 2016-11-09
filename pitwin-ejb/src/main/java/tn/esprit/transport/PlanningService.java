package tn.esprit.transport;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import tn.esprit.persistance.Planning;




@Stateless
@LocalBean
public class PlanningService implements PlanningServiceRemote, PlanningServiceLocal {

	@PersistenceContext
	private EntityManager em;
	
    public PlanningService() {
        
    	
    }

	@Override
	public List<Planning> viewPlanning() {
		return em
				.createQuery("select s from Planning s", Planning.class)
				.getResultList();
	}


	@Override
	public String AddPlanning(Planning planning) {
		em.persist(planning);
		return "Ajout avec succes";
	}

	

	@Override
	public List<Planning> getPlanningByDate(int day , int month , int year ) {
		
		Query query = em.createQuery("select p from Planning p where DAY(p.dateDepart_Planning) =:x  and MONTH(p.dateDepart_Planning)=:y and YEAR(p.dateDepart_Planning) =:z "); 
		query.setParameter("x", day); 
		query.setParameter("y", month);
		query.setParameter("z", year); 
		
		return query.getResultList();
	}
	
}
