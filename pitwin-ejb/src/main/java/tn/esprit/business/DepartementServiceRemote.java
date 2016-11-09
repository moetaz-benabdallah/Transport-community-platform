package tn.esprit.business;

import java.util.List;

import javax.ejb.Remote;

import tn.esprit.persistance.Departement;

@Remote
public interface DepartementServiceRemote {
	List<Departement>getall();
	Departement findById(int i);
	Departement findByName(String name);
	String add(Departement departement);
}
