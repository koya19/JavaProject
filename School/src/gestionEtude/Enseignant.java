package gestionEtude;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class Enseignant extends Personne implements Comparable<Enseignant>{
	protected int nbrElement;
	protected Set<Element> liste;
	protected int volumeHoraire;
	protected int volumeHoraireCours;
	protected int volumeHoraireTD;
	protected int volumeHoraireTP;
	protected int volumeHoraireAP;
	protected Promotion promo;
	protected Map<Etudiant, Float> note;
	
	
	public Enseignant() {
		super();
		System.out.println("Entrez le nombre d'éléments qui vous sont accordés");
		this.nbrElement = sc.nextInt();
		liste = new HashSet<>(nbrElement);
		note = new HashMap<>();
	}
	
	public Enseignant(String nom, String prenom, int year, int month, int day, String mail, String telephone,int nbrElement) {
		super(nom, prenom, "Enseignant", year, month, day, mail, telephone);
		this.nbrElement = nbrElement;
		this.liste = new HashSet<>();
		note = new HashMap<>();
	}

	public void addElement(Element e) {
		liste.add(e);
		this.volumeHoraire += e.getVolumeHoraire();
		this.volumeHoraireAP += e.getVolumeHoraireAP();
		this.volumeHoraireTP += e.getVolumeHoraireTP();
		this.volumeHoraireTD += e.getVolumeHoraireTD();
		this.volumeHoraireCours += e.getVolumeHoraireCours();
	}
	
	public void gestionEnseignant() {
		System.out.println("Choisissez votre prochaine action");
	}
	
	public void addElement() {
		Element e = new Element();
		liste.add(e);
		this.volumeHoraire += e.getVolumeHoraire();
		this.volumeHoraireAP += e.getVolumeHoraireAP();
		this.volumeHoraireTP += e.getVolumeHoraireTP();
		this.volumeHoraireTD += e.getVolumeHoraireTD();
		this.volumeHoraireCours += e.getVolumeHoraireCours();
	}
	
	public String getName() {
		return super.getNom();
	}
	
	public void setName() {
		super.setNom();
	}

	public int getNbrElement() {
		return nbrElement;
	}

	public void setNbrElement(int nbrElement) {
		this.nbrElement = nbrElement;
	}

	public int getVolumeHoraire() {
		return volumeHoraire;
	}

	public void setVolumeHoraire(int volumeHoraire) {
		this.volumeHoraire = volumeHoraire;
	}

	public String toString() {
		String s = "";
		for (Element e : liste) {
			s += "            ";
			s += e.nomElement;
			s += "\n";
		}
		return "L'enseignant " + nom + " " + prenom +" enseigne : \n"+ s +"Il a "+volumeHoraire+"h d'enseignement divisées ainsi : \n             "+volumeHoraireCours+"h de Cours Magistral\n             "+volumeHoraireTD+"h de TD\n             "+volumeHoraireTP+"h de TP\n             "+volumeHoraireAP+"h d'activités pratiques";
	}
	
	public void addNotes(Promotion p) {
		for (Etudiant e : p.Promo) {
			for (Element el : liste) {
				System.out.println("Entrez la note de " + e.getNom() + " en " + el.getNomElement());
				e.notes.put(el.getNomElement(), sc.nextFloat());
			}
		}
	}
	
	public void présence() {
		
	}
	
	public void afficherEnseignant() {
		System.out.println(toString());
	}

	@Override
	public int compareTo(Enseignant e) {
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
		result = prime * result + ((liste == null) ? 0 : liste.hashCode());
		result = prime * result + nbrElement;
		result = prime * result + volumeHoraire;
		result = prime * result + volumeHoraireAP;
		result = prime * result + volumeHoraireCours;
		result = prime * result + volumeHoraireTD;
		result = prime * result + volumeHoraireTP;
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
		Enseignant other = (Enseignant) obj;
		if (liste == null) {
			if (other.liste != null)
				return false;
		} else if (!liste.equals(other.liste))
			return false;
		if (nbrElement != other.nbrElement)
			return false;
		if (volumeHoraire != other.volumeHoraire)
			return false;
		if (volumeHoraireAP != other.volumeHoraireAP)
			return false;
		if (volumeHoraireCours != other.volumeHoraireCours)
			return false;
		if (volumeHoraireTD != other.volumeHoraireTD)
			return false;
		if (volumeHoraireTP != other.volumeHoraireTP)
			return false;
		return true;
	}
	
}
