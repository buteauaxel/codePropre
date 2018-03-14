/**
 * 
 */
package ex3;

/**
 * @author Axel B.
 * Enumeration des différents comportements des animaux
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
