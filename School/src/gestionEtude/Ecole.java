package gestionEtude;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ecole {
	protected String nom;
	protected String ville;
	protected String domaine;
	protected int anneeCreation;
	public Set<Fili�re> liste;
	
	Scanner sc = new Scanner(System.in);	
	
	public Ecole() {
		System.out.println("Entrez le nom de l'�cole");
		this.nom = sc.next();
		System.out.println("Entrez le nom de la ville o� se trouve l'�cole");
		this.ville = sc.next();
		System.out.println("Entrez le domaine de votre �cole");
		this.domaine = sc.next();
		sc.nextLine();
		System.out.println("Entrez l'ann�e de cr�ation de l'�cole");
		this.anneeCreation = sc.nextInt();
		sc.nextLine();
		liste = new HashSet<>();
	}
	
	public Ecole(String nom, String ville, String domaine, int anneeCreation) {
		super();
		this.nom = nom;
		this.ville = ville;
		this.domaine = domaine;
		this.anneeCreation = anneeCreation;
		this.liste = new HashSet<>();
	}

	public void gestionEcole() {
		System.out.println("Choisissez votre prochaine action :\n 1) Ajouer une fili�re\n 2) Supprimer une fili�re\n 3) Modifier le nom de l'�cole\n 4) Modifier le lieu de l'�cole\n 5) Modifier le domaine de l'�cole\n 6) Modifier l'ann�e de cr�ation de l'�cole\n 7) Afficher les informations g�n�rales sur l'�cole\n 8) Retour");
		int i = sc.nextInt();
		switch(i) {
		case 1 : System.out.println(); break;
		case 2 : System.out.println(); break;
		case 3 : setNom(); System.out.println("\n--------------------\n"); gestionEcole(); break;
		case 4 : setVille(); System.out.println("\n--------------------\n"); gestionEcole(); break;
		case 5 : setDomaine(); System.out.println("\n--------------------\n"); gestionEcole(); break;
		case 6 : setAnneeCreation(); System.out.println("\n--------------------\n"); gestionEcole(); break;
		case 7 : afficherEcole(); System.out.println("\n--------------------\n"); gestionEcole(); break;
		case 8 : sc.close(); /* � remplir */ ;break;
		}
	}
	
	public void addFili�re(Fili�re f) {
		liste.add(f);
	}
	
	public void removeFili�re(Fili�re f) {
		liste.remove(f);
	}

	public String getNom() {
		return nom;
	}

	public void setNom() {
		System.out.println("Entrez le nom de l'�cole");
		this.nom = sc.next();
	}

	public String getVille() {
		return ville;
	}

	public void setVille() {
		System.out.println("Entrez le nom de la ville o� se trouve l'�cole");
		this.ville = sc.next();
	}

	

	public String getDomaine() {
		return domaine;
	}

	public void setDomaine() {
		System.out.println("Entrez le domaine de votre �cole");
		this.domaine = sc.next();
	}

	public int getAnneeCreation() {
		return anneeCreation;
	}

	public void setAnneeCreation() {
		System.out.println("Entrez l'ann�e de cr�ation de l'�cole");
		this.anneeCreation = sc.nextInt();
	}
	
	public String toString() {
		String s = "";
		for(Fili�re f : liste) {
			s += "            ";
			s += f.getName();
			s +="\n";
		}
		return "L'" + nom + " qui se trouve � " + ville +" cr��e en "+ anneeCreation + " est une �cole d'" + domaine + " dont les fili�res sont :\n" + s;
	}
	
	public void afficherEcole() {
		System.out.println(toString());
	}
	
}
