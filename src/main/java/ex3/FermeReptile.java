package ex3;

/**
 * Classe FermeReptile qui est une catégorie de zone
 * @author Axel B.
 *
 */
public class FermeReptile extends Zone {
	
	public FermeReptile(){
		
	}

	/**
	 * QTE_POIDS : double
	 * 
	 */
	public static final double QTE_POIDS = 0.1;

	/**
	 * @return
	 */
	@Override
	public double getPoids() {
		return QTE_POIDS;

	}
}
