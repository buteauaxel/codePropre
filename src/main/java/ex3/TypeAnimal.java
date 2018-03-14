/**
 * 
 */
package ex3;

/**
 * @author Axel B.
 *
 */
public enum TypeAnimal {
	
	/** MAMMIFERE : TypeAnimal
	 * 
	 */
	MAMMIFERE ("Mammifere"),
	
	/** REPTILE : TypeAnimal
	 * 
	 */
	REPTILE ("Reptile"),
	
	/** POISSON : TypeAnimal
	 * 
	 */
	POISSON ("Poisson");
	
	private String typeAnimal; 
	
	
	/**
	 * @return the typeAnimal
	 */
	public String getTypeAnimal() {
		return typeAnimal;
	}

	
	/**
	 * @param typeAnimal the typeAnimal to set
	 */
	public void setTypeAnimal(String typeAnimal) {
		this.typeAnimal = typeAnimal;
	}

	/**
	 * @param typeAnimal
	 */
	private TypeAnimal(String typeAnimal){
		this.typeAnimal = typeAnimal;
		
		
	}

}
