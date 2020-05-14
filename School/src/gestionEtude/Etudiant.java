package gestionEtude;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Etudiant extends Personne implements Comparable<Etudiant> {
	protected String CNE;
	protected int anneePromo;
	protected Map<String, Float> notes;
	protected Map<String, Float> notes2;
	protected Map<String, Float> notes3;
	protected Set<String> listeElements;
	protected String filière;
	protected Filière f;
	protected Set<Module> m;
	protected int nbrTotalAbsence;
	protected String decision;
	
	public String getDecision() {
		return decision;
	}

	public void setDecision(String decision) {
		this.decision = decision;
	}

	public Etudiant() {
		super();
		System.out.println("Entrez votre CNE");
		this.CNE = sc.next();
		System.out.println("Vous êtes en quelle filière ?");
		this.filière = sc.next();
		System.out.println("Vous êtes en quelle année ?");
		this.anneePromo = sc.nextInt();
		this.notes = new HashMap<>();
		listeElements = new HashSet<>();
		m = new HashSet<>();
	}

	public Etudiant(String nom, String prenom, int year, int month, int day, String mail, String telephone, String CNE, int anneePromo, String filière) {
		super(nom, prenom, "Etudiant", year, month, day, mail, telephone);
		this.CNE = CNE;
		this.filière = filière;
		this.anneePromo = anneePromo;
		this.notes = new HashMap<>();
		listeElements = new HashSet<>();
	}

	public void gestionEtudiant() {
		System.out.println("Choisissez votre prochaine action :\n 1) Afficher les informations\n 2) Afficher la liste des éléments\n 3) Afficher la liste des notes\n 4) Afficher la moyenne\n 5) Afficher la note maximale\n 6) Afficher la note minimale\n 7) Afficher les absences\n 8) Quitter");
		switch(sc.nextInt()) {
		case 1 : afficherEtudiant(); gestionEtudiant(); break;
		case 2 : afficherElements(); gestionEtudiant(); break;
		case 3 : afficherNotes(); gestionEtudiant(); break;
		case 4 : moyenne(); gestionEtudiant(); break;
		case 5 : noteMax(); gestionEtudiant(); break;
		case 6 : noteMin(); gestionEtudiant(); break;
		case 7 : afficherAbsence(); gestionEtudiant(); break;
		case 8 : sc.close(); gestionEtudiant(); break;
		
		}
	}
	
	public int getNbrTotalAbsence() {
		return nbrTotalAbsence;
	}

	public void setNbrTotalAbsence(int nbrTotalAbsence) {
		this.nbrTotalAbsence = nbrTotalAbsence;
	}

	public int getAnneePromo() {
		return anneePromo;
	}

	public void setAnneePromo(int anneePromo) {
		this.anneePromo = anneePromo;
	}
	
	public Map<String, Float> getNotes() {
		return notes;
	}

	public Set<String> getListeElements() {
		return listeElements;
	}

	public String getFilière() {
		return filière;
	}

	public Filière getF() {
		return f;
	}

	public Set<Module> getM() {
		return m;
	}

	public String getNom() {
		return nom+" "+prenom;
	}

	public void setNom(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}

	public String getCNE() {
		return CNE;
	}

	public void setCNE(String cNE) {
		this.CNE = cNE;
	}
	
	public Filière getFiliere() {
		return f;
	}
	
	public double moyenne() {
		int c = 0;
		double f = 0;
		for (String str : listeElements) {
			c += notes.get(str); 
		}
		f = c/(notes.size());
		return f;
	}
	
	public void afficherMoyenne() {
		System.out.println("La moyenne de " + getNom() + " est : " + moyenne());
	}
	
	public void noteMax() {
		double f = 0;
		for (String str : listeElements) {
			if (f < notes.get(str)) {
				f = notes.get(str); 
			}
		}
		
		System.out.println("La note maximale de " + getNom() + " est : " + f);
	}
	
	public void afficherAbsence() {
		
	}
	
	public void noteMin() {
		double f = 20;
		for (String str : listeElements) {
			if (f > notes.get(str)) {
				f = notes.get(str); 
			}
		}
		
		System.out.println("La note minimale de " + getNom() + " est : " + f);
	}
	
	public void ajouterElement() {
		Element e = new Element();
		listeElements.add(e.getNomElement());
	} 
	
	public void ajouterElement(Element e) {
		listeElements.add(e.getNomElement());
	}
	
	public void afficherNotes() {
		for (String str : listeElements) {
			System.out.println("La note de " + getNom() + " en élément " + str + " est : " + notes.get(str));
		}
	}
	
	public String toString() {
		return "Nom complet : " + nom + " " + prenom + "\n" + "Mail : " + mail + "\n" + "Téléphone : " + telephone + "\n" + "CNE : " + CNE + "\n" + "Filière : " + filière + "\n" + "Année promotion : " + anneePromo;
	}
	
	public void afficherEtudiant() {
		System.out.println(getCNE() + " " + getNom());
	}
	
	public String miniPV() {
		return getCNE()+ " " + getNom() + " " + moyenne() + " " + getDecision();
	}
	
	public void afficherEtudiantDetails() {
		System.out.println(toString());
	}
	
	public int nbrModuleNV() {
		int i = 0;
		for (Module mo : m) {
			if ((mo.etatModule()).equalsIgnoreCase("Non validé")) i++;
		}
		return i;
	}
	
	public void afficherElements() {
		System.out.println("Les éléments que vous avez sont :");
		for (String str : listeElements) {
			System.out.println(str);
		}
	}
	
	@Override
	public int compareTo(Etudiant e) {
		int c = this.nom.compareToIgnoreCase(e.getNom());
		if (c == 0)
			return 0;
		else if (c > 0)
			return 1;
		else 
			return -1;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((CNE == null) ? 0 : CNE.hashCode());
		result = prime * result + anneePromo;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		super.equals(obj);
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Etudiant other = (Etudiant) obj;
		if (CNE == null) {
			if (other.CNE != null)
				return false;
		} else if (!CNE.equalsIgnoreCase(other.CNE))
			return false;
		if (anneePromo != other.anneePromo)
			return false;
		return true;
	}
	
}