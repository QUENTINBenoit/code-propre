package ex3;

import java.util.List;

public class Zoo {

	private String nom;

	//private List<String> types;
	private String types;
	// private List<String> noms;
	//private List<String> comportements;
	private String comportement;
	private Integer taille;
	public Zoo(String nom){
		this.nom = nom;
	}

	/**
	 *
	 * @param nom
	 * @param types
	 * @param comportement
	 * @param taille
	 */
	public Zoo(String nom, String types, String comportement, Integer taille) {
		this.nom = nom;
		this.types = types;
		this.comportement = comportement;
		this.taille = taille;
	}
	/*
	public void addAnimal(String nomAnimal, String typeAnimal, String comportement){
		types.add(typeAnimal);
		noms.add(nomAnimal);
		comportements.add(comportement);
	}
	*/

	/*
	public void afficherListeAnimaux(){
		for (int i=0; i<types.size(); i++) {
			System.out.println(noms.get(i)+" "+types.get(i)+" "+comportements.get(i));
		}
	}

	public int taille() {
		return types.size();
	}
	*/

	/** Getter for nom
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * getteer types
	 * @return
	 */
	public String getTypes() {
		return types;
	}

	/**
	 * Setter tupes
	 * @param types
	 */
	public void setTypes(String types) {
		this.types = types;
	}

	/**
	 * getter comportement
	 * @return
	 */
	public String getComportement() {
		return comportement;
	}

	/**
	 * Setter coportement
	 * @param comportement
	 */
	public void setComportement(String comportement) {
		this.comportement = comportement;
	}

	/**
	 * Getter tailles
	 * @return
	 */
	public Integer getTaille() {
		return taille;
	}

	/**
	 * Setter Taille
	 * @param taille
	 */
	public void setTaille(Integer taille) {
		this.taille = taille;
	}
}
