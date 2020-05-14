package School;

import java.util.HashMap;
import java.util.Map;
import gestionEtude.Module;

public class NotesEtudiant {
	protected int nbrModules;
	protected int numSemestre;
	protected Map<String ,Float> listeNote = new HashMap<>(nbrModules);
	
	public NotesEtudiant(int nbrModules, int numSemestre) {
		this.nbrModules = nbrModules;
		this.numSemestre = numSemestre;
	}
	
	public void addNote(Module m) {
		listeNote.put(m.getNom(), m.moyenne());
	}
	
	public void editNote(Module m, float note){
		listeNote.put(m.getNom(), note);
	}
	
	public float moyenne() {
		float c = 0;
		for (String key : listeNote.keySet())
			c += listeNote.get(key);
		return c/nbrModules;
	}
}
