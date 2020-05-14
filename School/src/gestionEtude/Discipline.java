package gestionEtude;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Discipline {
	protected String nomDiscipline;
	protected int nbrDiscipline;
	protected Set<String> Tab;
	
	Scanner sc = new Scanner(System.in);

	public Discipline() {
		System.out.println("Entrez le nom de la filière");
		this.nomDiscipline = sc.next();
		System.out.println("Entrez le nombre de discipline(s)");
		this.nbrDiscipline = sc.nextInt();
		this.Tab = new HashSet<>();
	}
	
	public Discipline(String nomDiscipline, int nbrDiscipline) {
		super();
		this.nomDiscipline = nomDiscipline;
		this.nbrDiscipline = nbrDiscipline;
		Tab = new HashSet<>();
	}

	public void addCompétence() {
		System.out.println("Entrez une discipline");
		boolean a = true;
		for (String s : Tab) {
			if (s.equalsIgnoreCase(sc.next())) a = false; break;
		}
		if (a == true) Tab.add(sc.next());
		else {
			System.out.println("Cette discipline existe déjà");
			addCompétence();
		}
	}
	
	public void deleteCompétence() {
		System.out.println("Entrez une discipline");
		boolean a = true;
		for (String s : Tab) {
			if (s.equalsIgnoreCase(sc.next())) a = false; break;
		}
		if (a == false) Tab.remove(sc.next());
		else {
			System.out.println("Cette discipline n'existe pas");
			addCompétence();
		}
	}

	public String toString() {
		String s = "Dans cette filière vous allez acquérir les disciplines suivantes :\n";;
		for (String str : Tab) {
			s += "           ";
			s += str;
			s += "\n";
		}
		return s;
	}
	
	public String getNomDiscipline() {
		return nomDiscipline;
	}

	public void setNomDiscipline() {
		System.out.println("Entrez le nom de la filière");
		this.nomDiscipline = sc.next();
	}

	public int getNbrCompétence() {
		return nbrDiscipline;
	}

	public void setNbrCompétence() {
		System.out.println("Entrez le nombre de discipline");
		this.nbrDiscipline = sc.nextInt();	
	}

	public void afficherDiscipline() {
		System.out.println(toString());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Tab == null) ? 0 : Tab.hashCode());
		result = prime * result + nbrDiscipline;
		result = prime * result + ((nomDiscipline == null) ? 0 : nomDiscipline.hashCode());
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
		Discipline other = (Discipline) obj;
		if (Tab == null) {
			if (other.Tab != null)
				return false;
		} else if (!Tab.equals(other.Tab))
			return false;
		if (nbrDiscipline != other.nbrDiscipline)
			return false;
		if (nomDiscipline == null) {
			if (other.nomDiscipline != null)
				return false;
		} else if (!nomDiscipline.equalsIgnoreCase(other.nomDiscipline))
			return false;
		return true;
	}
	
}
