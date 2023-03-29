package ex2;

/**
 * Représente un compte bancaire de type compte courante (type=CC) ou livret A (type=LA)
 *
 * @author DIGINAMIC
 */
public class CompteBancaire extends LivretA {

    /**
     * solde : solde du compte
     */
    private double solde;

    /**
     * decouvert : un découvert est autorisé seulement pour les comptes courants
     */
    private double decouvert;

    /**
     * Le type vaut soit CC=Compte courant, ou soit LA=Livret A
     */
    private String type;

    Double tauxDeRemu = new LivretA(5.6).getTauxRemuneration();

    /**
     * Ce constructeur est utilisé pour créer un compte de type Livret A
     *
     * @param type             = type du compte
     * @param solde            représente le solde du compte
     * @param decouvert        représente le découvert autorisé
     * @param tauxRemuneration représente le taux de rémunération du livret A
     */
    public CompteBancaire(double tauxRemuneration, double solde, double decouvert, String type) {
        super(tauxRemuneration);
        this.solde = solde;
        this.decouvert = decouvert;
        this.type = type;
    }


    /**
     * Ajoute un montant au solde
     *
     * @param montant
     */
    public void ajouterMontant(double montant) {
        this.solde += montant;
    }

    /**
     * Ajoute un montant au solde
     *
     * @param montant
     */
    public void debiterMontant(double montant) {
        if (type.equals("CC")) {
            if (this.solde - montant > decouvert) {
                this.solde = solde - montant;
            }
        } else if (type.equals("LA")) {
            if (this.solde - montant > 0) {
                this.solde = solde - montant;
            }
        }
    }

    /**
     * RemunAnnuelles
     */
    public void appliquerRemuAnnuelle() {
        if (type.equals("LA")) {
            this.solde = solde + solde * tauxDeRemu / 100;
        }
    }

    /**
     * Getter for solde
     *
     * @return the solde
     */
    public double getSolde() {

        return solde;
    }

    /**
     * Setter
     *
     * @param solde the solde to set
     */
    public void setSolde(double solde) {

        this.solde = solde;
    }

    /**
     * Getter for decouvert
     *
     * @return the decouvert
     */
    public double getDecouvert() {

        return decouvert;
    }

    /**
     * Setter
     *
     * @param decouvert the decouvert to set
     */
    public void setDecouvert(double decouvert) {

        this.decouvert = decouvert;
    }


    /**
     * Getter for type
     *
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * Setter
     *
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }


}
