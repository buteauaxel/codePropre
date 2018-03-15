package ex3;

/**
 * Classe SavaneAfricaine qui est une catégorie de zone
 * @author Axel B.
 *
 */
public class SavaneAfricaine extends Zone {
	
	/**
	 * constructeur vide
	 */
	public SavaneAfricaine(){
		
	}

/** QTE_POIDS : double
 * 
 */
public static final double QTE_POIDS  = 10;
	
	/**
	 * @return
	 */
	@Override
	public double getPoids(){
		return QTE_POIDS;
	}
}
