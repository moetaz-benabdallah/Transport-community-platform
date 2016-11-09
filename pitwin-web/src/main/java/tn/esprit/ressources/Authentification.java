package tn.esprit.ressources;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import tn.esprit.authentification.AuthentificationServiceLocal;
import tn.esprit.persistance.Person;

@Path("/connecter")
public class Authentification {
	@Inject
	AuthentificationServiceLocal myejb;
	
	
	@GET
	@Produces("Application/json")
	@Path("connect/{login}/{password}")
	public Person connect(@PathParam(value="login") String login,@PathParam(value="password") String password) {
		System.out.println("hahahhahaa");
		return myejb.connecter(login, password);
	
}
	}
