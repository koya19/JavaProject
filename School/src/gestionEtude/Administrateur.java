package gestionEtude;

import java.util.Set;
import java.util.TreeSet;

public class Administrateur extends Personne{
	protected Ecole e;
	protected Set<Responsable> équipe;
	
	
	public Administrateur(String mail, String prenom, int day, String nom, String telephone, int month, int year) {
		super(nom, prenom, "Administrateur", year, month, day, mail, telephone);
		this.e = new Ecole();
		this.équipe = new TreeSet<>();
	}
	
	public Administrateur() {
		super();
		this.e = new Ecole();
		this.équipe = new TreeSet<>();
	}
	
	public void addResponsable() {
		boolean a = false;
		Responsable r = new Responsable();
		for (Responsable re : équipe) {
			if (re.equals(r)) a = true;break;
		}
		if (a == false ) équipe.add(r);
		else {
			System.out.println("Ce responsable existe déjà");
			addResponsable(r);
		}
	}

	public void addResponsable(Responsable r) {
		boolean a = false;
		for (Responsable re : équipe) {
			if (re.equals(r)) a = true;break;
		}
		if (a == false ) équipe.add(r);
		else {
			System.out.println("Ce responsable existe déjà");
			addResponsable(r);
		}
	}

	public void getE() {
		e.afficherEcole();
	}

	public void setE(Ecole e) {
		e.gestionEcole();
	}

	public Set<Responsable> getÉquipe() {
		return équipe;
	}

	public void setÉquipe(Set<Responsable> équipe) {
		this.équipe = équipe;
	}

	@SuppressWarnings("deprecation")
	@Override
	public String toString() {
		return "L'administrateur est " + nom + " " + prenom + 
				 "né(e) en" + dN.getYear()+ "-" + dN.getMonth() + "-" + dN.getDate() + ", directeur de " + e.getNom() +"\nMail : " + mail + "\nTelephone : " + telephone;
	}
	
	
	
}
