package gestionEtude;

public class Salle {
	protected String nom;
	protected String fonction;
	protected boolean occupped;
	
	public Salle(String nom, String fonction) {
		this.nom = nom;
		this.fonction = fonction;
		this.occupped = false;
	}
}
