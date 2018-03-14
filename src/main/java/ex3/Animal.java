/**
 * 
 */
package ex3;

/**
 * @author Axel B.
 *
 */
public class Animal {

	/**
	 * @param args
	 */
	private String nomAnimal;
	private TypeAnimal typeAnimal;
	private Comportement comportementAnimal;

	public Animal(String nomAnimal, TypeAnimal typeAnimal,Comportement  comportementAnimal) {
		this.nomAnimal = nomAnimal;
		this.typeAnimal = typeAnimal;
		this.comportementAnimal = comportementAnimal;

	}

	@Override
	public String toString() {
		return "Animal [nomAnimal=" + nomAnimal + ", typeAnimal=" + typeAnimal + ", comportementAnimal="+ comportementAnimal + "]";
	}

	/**
	 * @return the nomAnimal
	 */
	public String getNomAnimal() {
		return nomAnimal;
	}

	/**
	 * @param nomAnimal
	 *            the nomAnimal to set
	 */
	public void setNomAnimal(String nomAnimal) {
		this.nomAnimal = nomAnimal;
	}

	/**
	 * @return the typeAnimal
	 */
	public TypeAnimal getTypeAnimal() {
		return typeAnimal;
	}

	/**
	 * @param typeAnimal the typeAnimal to set
	 */
	public void setTypeAnimal(TypeAnimal typeAnimal) {
		this.typeAnimal = typeAnimal;
	}

	/**
	 * @return the comportementAnimal
	 */
	public Comportement getComportementAnimal() {
		return comportementAnimal;
	}

	/**
	 * @param comportementAnimal the comportementAnimal to set
	 */
	public void setComportementAnimal(Comportement comportementAnimal) {
		this.comportementAnimal = comportementAnimal;
	}

	
	
	

}
