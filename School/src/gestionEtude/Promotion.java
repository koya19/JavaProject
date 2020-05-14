package gestionEtude;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Promotion implements Comparable<Promotion>{
	protected String nomPromo;
	protected int anneePromo;
	public Set<Etudiant> Promo; //public la
	public Set<Enseignant> list; //public la
	
	Scanner sc = new Scanner(System.in);
	
	public Promotion(String nomPromo, int anneePromo) {
		this.nomPromo = nomPromo;
		this.anneePromo = anneePromo;
		this.Promo = new HashSet<Etudiant>();
		this.list = new HashSet<>();
	}

	public Promotion() {
		System.out.println("Entrez le nom de la promotion");
		this.nomPromo = sc.next();
		System.out.println("Entrez l'année de début la promotion");
		this.anneePromo = sc.nextInt();
		this.list = new HashSet<>();
		this.Promo = new HashSet<>();
	}
	
	public void addStudent(Etudiant e) {
		boolean a = true;
		for (Etudiant s : Promo) {
			if (s.equals(e)) a = false; break;
		}
		if (a == true) Promo.add(e);
		else {
			System.out.println("Cette étudiant existe déjà");
		}
	}
	
	public void listEtudiant() {
		int i = 1;
		for (Etudiant e : Promo)
		{
			System.out.println(i + ") " + e.getNom());
			i++;
		}
	}

	public void deleteStudent(Etudiant e) {
		for (Etudiant et : Promo) {
			if (e.equals(et)) {
				System.out.println(Promo.remove(et));
			}
		}
	}
	
	public void addEnseignant(Enseignant en) {
		boolean a = true;
		for (Enseignant es : list) {
			if (es.equals(en)) a = false; break;
		}
		if (a == true) list.add(en);
		else {
			System.out.println("Cette étudiant existe déjà");
		}
	}
	
	public void deleteEnseignant(Enseignant en) {
		for (Enseignant et : list) {
			if (en.equals(et)) {
				list.remove(et);
			}
		}
	}
	
	public void afficherPromoDETAILS() {
		Iterator<Etudiant> it = Promo.iterator();
		Etudiant e;
		System.out.println(nomPromo+" de l'année "+anneePromo+" dont les élèves sont :");
		while (it.hasNext()) {
			e = it.next();
			e.afficherEtudiantDetails();
		}
	}
	
	public void afficherPromo() {
		Iterator<Etudiant> it = Promo.iterator();
		Etudiant e;
		System.out.println(nomPromo+" de l'année "+anneePromo+" dont les élèves sont :");
		while (it.hasNext()) {
			e = it.next();
			e.afficherEtudiant();
		}
	}
	
	public String getNomPromo() {
		return nomPromo;
	}

	public void setNomPromo(String nomPromo) {
		this.nomPromo = nomPromo;
	}

	public int getAnneePromo() {
		return anneePromo;
	}

	public void setAnneePromo(int anneePromo) {
		this.anneePromo = anneePromo;
	}
	
	public void afficherListeEnseignant() {
		for (Enseignant e : list) {
			e.afficherPersonne();
		}
	}
	
	@Override
	public int compareTo(Promotion p) {
		int c = this.nomPromo.compareToIgnoreCase(p.getNomPromo());
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
		int result = 1;
		result = prime * result + ((Promo == null) ? 0 : Promo.hashCode());
		result = prime * result + anneePromo;
		result = prime * result + ((list == null) ? 0 : list.hashCode());
		result = prime * result + ((nomPromo == null) ? 0 : nomPromo.hashCode());
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
		Promotion other = (Promotion) obj;
		if (Promo == null) {
			if (other.Promo != null)
				return false;
		} else if (!Promo.equals(other.Promo))
			return false;
		if (anneePromo != other.anneePromo)
			return false;
		if (list == null) {
			if (other.list != null)
				return false;
		} else if (!list.equals(other.list))
			return false;
		if (nomPromo == null) {
			if (other.nomPromo != null)
				return false;
		} else if (!nomPromo.equalsIgnoreCase(other.nomPromo))
			return false;
		return true;
	}
	
}