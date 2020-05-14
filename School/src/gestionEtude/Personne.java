package gestionEtude;

import java.util.Date;
import java.util.Scanner;

public class Personne {
	
	protected String nom;
	protected String prenom;
	protected String accessLevel;
	protected Date dN;
	protected String mail;
	protected String telephone;
	
	Scanner sc = new Scanner(System.in);
	
	@SuppressWarnings("deprecation")
	public Personne() {
		System.out.println("Tapez votre nom");
		this.nom = sc.next();
		System.out.println("Tapez votre prenom");
		this.prenom = sc.next();
		System.out.println("Tapez votre année de naissance");
		int year = sc.nextInt();
		System.out.println("Tapez votre mois de naissance");
		int month = sc.nextInt();
		System.out.println("Tapez votre jour de naissance");
		int day = sc.nextInt();
		this.dN = new Date(year, month, day);
		System.out.println("Tapez votre mail");
		this.mail = sc.next();
		System.out.println("Tapez votre numéro de téléphone");
		this.telephone = sc.next();
	}
	
	public Personne(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}

	@SuppressWarnings("deprecation")
	public Personne(String nom, String prenom, String accessLevel, int year, int month, int day, String mail, String telephone) {
		this.nom = nom;
		this.prenom = prenom;
		this.accessLevel = accessLevel;
		this.dN = new Date(year,month,day);
		this.mail = mail;
		this.telephone = telephone;
	}

	public String getNom() {
		return nom + " " + prenom;
	}

	public void setNom() {
		System.out.println("Veuillez entrer votre nom");
		this.nom = sc.next();
	
	}
	
	public void setPrenom() {
	
		System.out.println("Veuillez entrer votre prénom");
		this.prenom = sc.next();
		
	}
	
	@SuppressWarnings("deprecation")
	public String getdN() {
		String s = "";
		s = dN.getDate() + "-" + dN.getMonth() + "-" + dN.getYear();
		return s;
	}

	@SuppressWarnings("deprecation") 
	public void setdN() {
		
		System.out.println("Veuillez entrer votre annee de naissance");
		dN.setYear(sc.nextInt());
		System.out.println("Veuillez entrer votre mois de naissance");
		dN.setMonth(sc.nextInt());
		System.out.println("Veuillez entrer votre jour de naissance");
		dN.setDate(sc.nextInt());
		
	}

	public String getMail() {
		return mail;
	}

	public void setMail() {
		
		System.out.println("Veuillez entrer votre mail");
		this.mail = sc.next();
		
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone() {
		System.out.println("Veuillez entrer votre telephone");
		this.telephone = sc.next();
	}

	public void quitter() {
		sc.close();
	}
	
	public String toString() {
		return "Vous êtes un " + accessLevel + ", votre nom complet est " + nom +" "+ prenom;
	}
	
	public void afficherPersonne() {
		System.out.println(toString());
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accessLevel == null) ? 0 : accessLevel.hashCode());
		result = prime * result + ((dN == null) ? 0 : dN.hashCode());
		result = prime * result + ((mail == null) ? 0 : mail.hashCode());
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + ((prenom == null) ? 0 : prenom.hashCode());
		result = prime * result + ((telephone == null) ? 0 : telephone.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Personne other = (Personne) obj;
		if (accessLevel == null) {
			if (other.accessLevel != null)
				return false;
		} else if (!accessLevel.equalsIgnoreCase(other.accessLevel))
			return false;
		if (dN == null) {
			if (other.dN != null)
				return false;
		} else if (!dN.equals(other.dN))
			return false;
		if (mail == null) {
			if (other.mail != null)
				return false;
		} else if (!mail.equalsIgnoreCase(other.mail))
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equalsIgnoreCase(other.nom))
			return false;
		if (prenom == null) {
			if (other.prenom != null)
				return false;
		} else if (!prenom.equalsIgnoreCase(other.prenom))
			return false;
		if (telephone == null) {
			if (other.telephone != null)
				return false;
		} else if (!telephone.equals(other.telephone))
			return false;
		return true;
	}
	
}