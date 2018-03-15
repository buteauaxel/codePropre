package ex3;

/**
 * Classe Aquarium qui est une catégorie de zone
 * @author Axel B.
 *
 */
public class Aquarium extends Zone {

	/**
	 * QTE_POIDS : double
	 * 
	 */
	public static final double QTE_POIDS = 0.2;

	/**
	 * @return
	 */
	@Override
	public double getPoids() {
		return QTE_POIDS;
	}
}
