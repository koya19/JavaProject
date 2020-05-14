package gestionScolarité;

import gestionEtude.Etudiant;
import gestionEtude.Promotion;

public class PvDeDélibération {
	protected Promotion p;
	
	public PvDeDélibération(Promotion p) {
		this.p = p;
	}
	
	public void générerPV() {
		System.out.println("PV de délibération pour la promotion " + p.getNomPromo() + " de l'année " + p.getAnneePromo());
		for (Etudiant e : p.Promo) {
			System.out.println(e.miniPV());
		}
	}
}
