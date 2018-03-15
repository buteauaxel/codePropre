/**
 * 
 */
package ex3;

/**
 * @author Axel B.
 * Enumeration des différents comportements  animaux
 */

public enum Comportement {
	
	/** CARNIVORE : Comportement
	 * 
	 */
	CARNIVORE ("Carnivore"),
	
	/** HERBIVORE : Comportement
	 * 
	 */
	HERBIVORE ("Herbivore");

	private String comportement;
	
	
	/**
	 * @param comportement
	 */
	private Comportement(String comportement) {
		this.comportement = comportement;
	}


	/**
	 * @return the comportement
	 */
	public String getComportement() {
		return comportement;
	}


	/**
	 * @param comportement the comportement to set
	 */
	public void setComportement(String comportement) {
		this.comportement = comportement;
	}
	
	
	
}
