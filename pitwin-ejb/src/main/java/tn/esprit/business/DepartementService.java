package tn.esprit.business;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.esprit.persistance.Departement;
import tn.esprit.persistance.Reservation;

/**
 * Session Bean implementation class DepartementService
 */
@Stateless
@LocalBean
public class DepartementService implements DepartementServiceRemote, DepartementServiceLocal {
@PersistenceContext(unitName="pitwin-ejb")
	Departement dept1 = new Departement("chiheb");
	Departement dept2 = new Departement("raja");
	Departement dept3 = new Departement("khalil");
	
	EntityManager em;
	ArrayList<Departement> listDepartement = new ArrayList<Departement>();
    /**
     * Default constructor. 
     */
    public DepartementService() {
    	
		listDepartement.add(dept2);
		listDepartement.add(dept1);
		listDepartement.add(dept3);

    }

	@Override
	public List<Departement> getall(){
	String req="select r from departement r";
		
		
		return em.createQuery(req,Departement.class).getResultList();
		//return listDepartement;
	}

	@Override
	public Departement findByName(String name) {
		
		for(Departement d : listDepartement){
			if (d.getName().equals(name))
				
			return d;
		}
		return null;
	}

	@Override
	public String add(Departement departement) {
		if (listDepartement.add(departement))
		{
		
			return"success to add";
		}
		return "failed";
	}

	@Override
	
	public Departement findById(int i) {
		for (Departement d : listDepartement){
			if (d.getId()== i)
				return d;
		}
		return null;
	}

	

}
