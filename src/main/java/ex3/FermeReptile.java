package ex3;

/**
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
