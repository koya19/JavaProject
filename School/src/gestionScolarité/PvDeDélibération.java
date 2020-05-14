package gestionScolarit�;

import gestionEtude.Etudiant;
import gestionEtude.Promotion;

public class PvDeD�lib�ration {
	protected Promotion p;
	
	public PvDeD�lib�ration(Promotion p) {
		this.p = p;
	}
	
	public void g�n�rerPV() {
		System.out.println("PV de d�lib�ration pour la promotion " + p.getNomPromo() + " de l'ann�e " + p.getAnneePromo());
		for (Etudiant e : p.Promo) {
			System.out.println(e.miniPV());
		}
	}
}
