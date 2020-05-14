package gestionEtude;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Filière extends Discipline {
	public ChefDeFilière respo; //public la
	public Set<Promotion> Table; //public la
	
	public Filière() {
		super();
		respo = new ChefDeFilière();
		Table = new HashSet<>(3);
	}

	public Filière(String nomDiscipline, int nbrDiscipline) {
		super(nomDiscipline, nbrDiscipline);
		respo = new ChefDeFilière(null, null, 1, 0, 0, null, null, null, null, null);
		Table = new HashSet<>(3);
	}

	public String getName() {
		return super.getNomDiscipline();
	}

	public void setName() {
		super.setNomDiscipline();
	}

	public Set<Promotion> getTable() {
		return Table;
	}

	public void addPromo() {
		boolean a = true;
		Promotion p = new Promotion();
		Iterator<Promotion> it = Table.iterator();
		if (!it.hasNext()) Table.add(p);
		else{
			for (Promotion pr : Table) {
				if (pr.equals(p)); a = false; break;
			}
			if ((it.next()).anneePromo + 1 == p.anneePromo && a == true) Table.add(p);
			else if ((it.next()).anneePromo + 1 != p.anneePromo) {
				System.out.println("L'ordre des années de promotion n'a pas été respécté");
				addPromo();
			}
			else if (a == false) {
				System.out.println("Cette promotion existe déjà");
				addPromo();
			}
		}
	}
	
	public void addPromo(Promotion p) {
		if (Table.size() == 0) Table.add(p);
		else {
			if (Table.contains(p) == false) Table.add(p);
			else System.out.println("Cette promotion existe déja");
			}
	}
	
	public void editPromo() {
		boolean a = true;
		System.out.println("Entrez la promotion à modifier");
		Promotion p = new Promotion();
		System.out.println("Entrez la nouvelle promotion");
		Promotion p1 = new Promotion();
		for (Promotion pt : Table) {
			if (p.equals(pt)) {
				pt = p1;
				a = false;
				break;
			}
		}
		if (a == true) {
			System.out.println("Cette promotion n'existe pas");
			editPromo();
		}
	}
	
	public void deletePromo() {
		boolean a = true;
		Promotion p = new Promotion();
		Iterator<Promotion> it = Table.iterator();
		if (!it.hasNext()) {
			if (Table.contains(p))Table.remove(p);
			else {
				System.out.println("Cette promotion n'existe pas");
				deletePromo();
			}
		}
		else {
			for (Promotion pr : Table) {
				if (pr.equals(p)); a = false; break;
			}
			if (a == false) Table.remove(p);
			else {
				System.out.println("Cette promotion n'existe pas");
				deletePromo();
			}
		}
	}
	
	public void afficherFiliere() {
		Iterator<Promotion> it = Table.iterator();
		Promotion p;
		System.out.println(super.nomDiscipline+" contient :");
		System.out.println("------------------------");
		while (it.hasNext()) {
			p = it.next();
			p.afficherPromo();
			System.out.println("------------------------");
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((Table == null) ? 0 : Table.hashCode());
		result = prime * result + ((respo == null) ? 0 : respo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Filière other = (Filière) obj;
		if (Table == null) {
			if (other.Table != null)
				return false;
		} else if (!Table.equals(other.Table))
			return false;
		if (respo == null) {
			if (other.respo != null)
				return false;
		} else if (!respo.equals(other.respo))
			return false;
		return true;
	}
}