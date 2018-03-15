package ex3;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Axel B.
 * Classe Zoo qui regroupe les animaux 
 */
public class Zoo {

	/** nom : String
	 * 
	 */
	private String nom;
	/** savaneAfricaine : SavaneAfricaine
	 * 
	 */
	
	private List<Animal> listAnimal = new ArrayList<>();
	private List<Zone> zones = new ArrayList<>();
	
	/**
	 * Ajoute les différentes zones du zoo
	 * @param nom
	 */
	public Zoo(String nom){
		this.nom = nom;
		zones.add(new ZoneCarnivore());
		zones.add(new Aquarium());
		zones.add(new FermeReptile());
		zones.add(new SavaneAfricaine());
	}

	
	
	/**
	 * @param animal
	 */
	public void addAnimal(Animal animal){
	
	listAnimal.add(animal);
	for (Zone Zone : zones){
		Zone.addAnimal(animal);
			
		}		
		
	}

	/**
	 * Affiche la liste des animaux par zone
	 */
	public void afficherListeAnimaux() {
		for(Animal animal : listAnimal){
			System.out.println(animal);
		}
	}

	/**
	 * Getter for nom
	 * 
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter
	 * 
	 * @param nom
	 *            the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
}
