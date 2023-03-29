package ex2;

public class LivretA {


    /**
     * tauxRemuneration : taux de rémunération dans le cas d'un livret A
     */
    private double tauxRemuneration;

    public LivretA(double tauxRemuneration) {
        this.tauxRemuneration = tauxRemuneration;
    }

    /** Getter for type
     * @return the type
     */
    public double getTauxRemuneration() {
        return tauxRemuneration;
    }

    /**
     *
     * @param tauxRemuneration
     */
    public void setTauxRemuneration(double tauxRemuneration) {

        this.tauxRemuneration = tauxRemuneration;
    }

}
