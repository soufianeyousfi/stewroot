package org.sympanux;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.sympanux.dao.VehiculeRepository;
import org.sympanux.entities.Vehicule;

@SpringBootApplication
public class RentcarApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(RentcarApplication.class, args);
	VehiculeRepository vehiculeRepository = ctx.getBean(VehiculeRepository.class);

	vehiculeRepository.save(new Vehicule("ferrari", "jaune", 2));
	vehiculeRepository.save(new Vehicule("porshe", "grise", 4));
	vehiculeRepository.save(new Vehicule("audi", "blanche", 5));
	
	
				vehiculeRepository.findAll().forEach(result-> System.out.println("marque de voiture <"+result.getMarque()+"> Nombre de porte "+result.getNombreDePorte()+" avec la couleur  "+result.getCouleur()));
		
	}
}
