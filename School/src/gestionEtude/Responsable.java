package gestionEtude;

public class Responsable extends Personne implements Comparable<Responsable>{
	protected String tâche;
	protected String numBureau;
	
	public Responsable() {
		super();
		System.out.println("Entrez votre tâche");
		this.tâche = sc.next();
		System.out.println("Entrez votre numéro de bureau");
		this.numBureau = sc.next();
	}

	public Responsable(String nom, String prenom, int year, int month, int day, String mail, String telephone,String tâche, String numBureau) {
		super(nom, prenom, "Responsable", year, month, day, mail, telephone);
		this.tâche = tâche;
		this.numBureau = numBureau;
	}
	
	public String getTâche() {
		return tâche;
	}

	public void setTâche(String tâche) {
		this.tâche = tâche;
	}

	public String getNumBureau() {
		return numBureau;
	}

	public void setNumBureau(String numBureau) {
		this.numBureau = numBureau;
	}

	@Override
	public int compareTo(Responsable e) {
		int c = this.nom.compareTo(e.getNom());
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
		result = prime * result + ((numBureau == null) ? 0 : numBureau.hashCode());
		result = prime * result + ((tâche == null) ? 0 : tâche.hashCode());
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
		Responsable other = (Responsable) obj;
		if (numBureau == null) {
			if (other.numBureau != null)
				return false;
		} else if (!numBureau.equalsIgnoreCase(other.numBureau))
			return false;
		if (tâche == null) {
			if (other.tâche != null)
				return false;
		} else if (!tâche.equalsIgnoreCase(other.tâche))
			return false;
		return true;
	}
	
	
}
