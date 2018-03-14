package ex2;

public class LivretA extends CompteBancaire {

	/** tauxRemuneration : taux de rÃ©munÃ©ration dans le cas d'un livret A */
	private double tauxRemuneration;


	/**
	 * @param solde
	 * @param tauxRemuneration
	 */
	public LivretA( double solde, double tauxRemuneration) {
		super(solde, 0);
		this.setTauxRemuneration(tauxRemuneration);

	}
		
	/**
	 * Applique un taux de  rémunération annuelle
	 */
	public void appliquerRemuAnnuelle() {

		setSolde(getSolde() + getSolde() * tauxRemuneration/100);
	}


	/**
	 * Getter for tauxRemuneration
	 * 
	 * @return the tauxRemuneration
	 */
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}

	/**
	 * Setter
	 * 
	 * @param tauxRemuneration
	 *            the tauxRemuneration to set
	 */
	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}

}
