package gestionEtude;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ecole {
	protected String nom;
	protected String ville;
	protected String domaine;
	protected int anneeCreation;
	public Set<Filière> liste;
	
	Scanner sc = new Scanner(System.in);	
	
	public Ecole() {
		System.out.println("Entrez le nom de l'école");
		this.nom = sc.next();
		System.out.println("Entrez le nom de la ville où se trouve l'école");
		this.ville = sc.next();
		System.out.println("Entrez le domaine de votre école");
		this.domaine = sc.next();
		sc.nextLine();
		System.out.println("Entrez l'année de création de l'école");
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
		System.out.println("Choisissez votre prochaine action :\n 1) Ajouer une filière\n 2) Supprimer une filière\n 3) Modifier le nom de l'école\n 4) Modifier le lieu de l'école\n 5) Modifier le domaine de l'école\n 6) Modifier l'année de création de l'école\n 7) Afficher les informations générales sur l'école\n 8) Retour");
		int i = sc.nextInt();
		switch(i) {
		case 1 : System.out.println(); break;
		case 2 : System.out.println(); break;
		case 3 : setNom(); System.out.println("\n--------------------\n"); gestionEcole(); break;
		case 4 : setVille(); System.out.println("\n--------------------\n"); gestionEcole(); break;
		case 5 : setDomaine(); System.out.println("\n--------------------\n"); gestionEcole(); break;
		case 6 : setAnneeCreation(); System.out.println("\n--------------------\n"); gestionEcole(); break;
		case 7 : afficherEcole(); System.out.println("\n--------------------\n"); gestionEcole(); break;
		case 8 : sc.close(); /* à remplir */ ;break;
		}
	}
	
	public void addFilière(Filière f) {
		liste.add(f);
	}
	
	public void removeFilière(Filière f) {
		liste.remove(f);
	}

	public String getNom() {
		return nom;
	}

	public void setNom() {
		System.out.println("Entrez le nom de l'école");
		this.nom = sc.next();
	}

	public String getVille() {
		return ville;
	}

	public void setVille() {
		System.out.println("Entrez le nom de la ville où se trouve l'école");
		this.ville = sc.next();
	}

	

	public String getDomaine() {
		return domaine;
	}

	public void setDomaine() {
		System.out.println("Entrez le domaine de votre école");
		this.domaine = sc.next();
	}

	public int getAnneeCreation() {
		return anneeCreation;
	}

	public void setAnneeCreation() {
		System.out.println("Entrez l'année de création de l'école");
		this.anneeCreation = sc.nextInt();
	}
	
	public String toString() {
		String s = "";
		for(Filière f : liste) {
			s += "            ";
			s += f.getName();
			s +="\n";
		}
		return "L'" + nom + " qui se trouve à " + ville +" créée en "+ anneeCreation + " est une école d'" + domaine + " dont les filières sont :\n" + s;
	}
	
	public void afficherEcole() {
		System.out.println(toString());
	}
	
}
