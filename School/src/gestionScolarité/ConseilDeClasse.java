package gestionScolarité;

import java.util.HashSet;
import java.util.Set;

import gestionEtude.ChefDeFilière;
import gestionEtude.Etudiant;
import gestionEtude.Responsable;

public class ConseilDeClasse {
	protected Set<Responsable> equipe;
	protected ChefDeFilière chef;
	protected Etudiant e;
	
	public ConseilDeClasse(ChefDeFilière chef, Etudiant e) {
		this.equipe = new HashSet<>();
		this.chef = chef;
		this.e = e;
	}
	
	public String Décision() {
		if (e.nbrModuleNV() <= 2) {
			e.setDecision("Passage");
			return "Passage";
		}
		else if (e.nbrModuleNV() <= 4 && e.getNbrTotalAbsence() <= 8) {
			e.setDecision("Passage");
			return "Passage";
		}
		else {
			e.setDecision("Redoublement");
			return "Redoublement";
		}
	}
	
}
