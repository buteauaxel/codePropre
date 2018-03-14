/**
 * 
 */
package ex3;

import java.util.List;

/**
 * @author Axel B.
 *
 */
public abstract class Zone {
	
public  List<Animal> listeAnimaux;
	
	
	public void addAnimal(Animal animal) {
		listeAnimaux.add(animal);
	}
	
	public void afficherListeAnimaux(){
		for (Animal animal : listeAnimaux){
			System.out.println(animal);
		}
	}
	
	public abstract double getPoids();
	
	public double calculerKgsNourritureParJour(){
		return listeAnimaux.size() * getPoids();

}

	/**
	 * @return the listeAnimaux
	 */
	public List<Animal> getListeAnimaux() {
		return listeAnimaux;
	}

	/**
	 * @param listeAnimaux the listeAnimaux to set
	 */
	public void setListeAnimaux(List<Animal> listeAnimaux) {
		this.listeAnimaux = listeAnimaux;
	}
	
}