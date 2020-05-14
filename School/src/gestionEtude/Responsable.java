package gestionEtude;

public class Responsable extends Personne implements Comparable<Responsable>{
	protected String t�che;
	protected String numBureau;
	
	public Responsable() {
		super();
		System.out.println("Entrez votre t�che");
		this.t�che = sc.next();
		System.out.println("Entrez votre num�ro de bureau");
		this.numBureau = sc.next();
	}

	public Responsable(String nom, String prenom, int year, int month, int day, String mail, String telephone,String t�che, String numBureau) {
		super(nom, prenom, "Responsable", year, month, day, mail, telephone);
		this.t�che = t�che;
		this.numBureau = numBureau;
	}
	
	public String getT�che() {
		return t�che;
	}

	public void setT�che(String t�che) {
		this.t�che = t�che;
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
		result = prime * result + ((t�che == null) ? 0 : t�che.hashCode());
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
		if (t�che == null) {
			if (other.t�che != null)
				return false;
		} else if (!t�che.equalsIgnoreCase(other.t�che))
			return false;
		return true;
	}
	
	
}
