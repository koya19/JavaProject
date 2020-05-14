package School;

import gestionEtude.Element;
import gestionEtude.Etudiant;
import gestionEtude.Seance;

public class Absence {
	protected Etudiant e;
	protected Seance s;
	protected Element el;
	protected int numAbsence;
	
	public Absence(Etudiant e, Seance s, Element el, int numAbsence) {
		this.e = e;             //a verifer
		this.s = s;            //a verifer 
		this.el = el;         //a verifer
		this.numAbsence = numAbsence;
	}
	
	
}
