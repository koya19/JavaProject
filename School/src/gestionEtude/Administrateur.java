package gestionEtude;

import java.util.Set;
import java.util.TreeSet;

public class Administrateur extends Personne{
	protected Ecole e;
	protected Set<Responsable> �quipe;
	
	
	public Administrateur(String mail, String prenom, int day, String nom, String telephone, int month, int year) {
		super(nom, prenom, "Administrateur", year, month, day, mail, telephone);
		this.e = new Ecole();
		this.�quipe = new TreeSet<>();
	}
	
	public Administrateur() {
		super();
		this.e = new Ecole();
		this.�quipe = new TreeSet<>();
	}
	
	public void addResponsable() {
		boolean a = false;
		Responsable r = new Responsable();
		for (Responsable re : �quipe) {
			if (re.equals(r)) a = true;break;
		}
		if (a == false ) �quipe.add(r);
		else {
			System.out.println("Ce responsable existe d�j�");
			addResponsable(r);
		}
	}

	public void addResponsable(Responsable r) {
		boolean a = false;
		for (Responsable re : �quipe) {
			if (re.equals(r)) a = true;break;
		}
		if (a == false ) �quipe.add(r);
		else {
			System.out.println("Ce responsable existe d�j�");
			addResponsable(r);
		}
	}

	public void getE() {
		e.afficherEcole();
	}

	public void setE(Ecole e) {
		e.gestionEcole();
	}

	public Set<Responsable> get�quipe() {
		return �quipe;
	}

	public void set�quipe(Set<Responsable> �quipe) {
		this.�quipe = �quipe;
	}

	@SuppressWarnings("deprecation")
	@Override
	public String toString() {
		return "L'administrateur est " + nom + " " + prenom + 
				 "n�(e) en" + dN.getYear()+ "-" + dN.getMonth() + "-" + dN.getDate() + ", directeur de " + e.getNom() +"\nMail : " + mail + "\nTelephone : " + telephone;
	}
	
	
	
}
