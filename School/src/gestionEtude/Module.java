package gestionEtude;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Module {
	protected String nom;
	protected int numSemestre;
	protected int volumeHoraire;
	protected int nbrElements;
	protected Set<Element> ListE = new HashSet<>(nbrElements);
	protected String[] listElements = new String[nbrElements];
	protected Map<String ,Double> listeNote = new HashMap<>(nbrElements);
	protected double[] note;
	
	public Module(String nom, int volumeHoraire, int nbrElements) {
		this.nom = nom;
		this.volumeHoraire = volumeHoraire;
		this.nbrElements = nbrElements;
		note = new double[nbrElements];
	}
	
	public void getListE() {
		Iterator<Element> it = ListE.iterator();
		Element e;
		while (it.hasNext()) {
			e = it.next();
			e.afficherElement();
		}
	}

	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getVolumeHoraire() {
		return volumeHoraire;
	}
	
	public void setVolumeHoraire(int volumeHoraire) {
		this.volumeHoraire = volumeHoraire;
	}
	
	public int getNbrElements() {
		return nbrElements;
	}
	
	public void addElement(Element e) {
		ListE.add(e);
	}
	
	public void removeElement(Element e) {
		ListE.remove(e);
	}
	
	public void setNbrElements(int nbrElements) {
		this.nbrElements = nbrElements;
	}
	
	public void addNote(Element e, double note) {
		listeNote.put(e.getNomElement(), note);
	}
	
	public void editNote(Element e, double note){
		listeNote.put(e.getNomElement(), note);
	}
	
	public double getNote(Element e) {
		return listeNote.get(e.nomElement);
	}
	
	public double getNotes(int j) {
		int i = 0;
		for (Element e : ListE) {
			note[i] = getNote(e);
			i++;
		}
		return note[j];
	}
	
	public float moyenne() {
		float c = 0;
		for (String key : listeNote.keySet())
			c += listeNote.get(key);
		return c/getNbrElements();
	}
	
	public String etatModule() {
		boolean b = false;
		for (int i = 0; i < getNbrElements(); i++) {
			double f = getNotes(i);
			if (f >= 6.0) b = true;
			else {
				b = false;
				break;
			}
		}
		if (moyenne() >= 11 && b == true) return "Validé";
		else return "Non validé";
	}
	
	public String toString() {
		String s = "";
		s = "Le module "+ getNom() +" contient le(s) élément(s) : \n";
		for (Element e : ListE) {
				s += "           ";
				s += e.getNomElement();
				s += "\n";
		}
		return s;
	}
	
	public void afficherModule() {
		System.out.println(toString());
	}
	
}