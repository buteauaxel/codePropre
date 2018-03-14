package ex3;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

	private String nom;
	private SavaneAfricaine savaneAfricaine;
	private ZoneCarnivore zoneCarnivore;
	private FermeReptile fermeReptile;
	private Aquarium aquarium;

	private List<Animal> listAnimal = new ArrayList<>();
	private List<Zone> zones = new ArrayList<>();
	
	public Zoo(String nom){
		this.nom = nom;
		zones.add(new ZoneCarnivore());
		zones.add(new Aquarium());
		zones.add(new FermeReptile());
		zones.add(new SavaneAfricaine());
	}

	
	
	public void addAnimal(Animal animal){
	
	listAnimal.add(animal);
	for (Zone Zone : zones){
		Zone.addAnimal(animal);
			
		}		
		
	}

	public void afficherListeAnimaux() {
		savaneAfricaine.getListeAnimaux();
		zoneCarnivore.getListeAnimaux();
		fermeReptile.getListeAnimaux();
		aquarium.getListeAnimaux();
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
