package gestionEtude;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Seance {
	protected Element el;
	protected Date dateSeance;
	protected Set<Etudiant> Liste;
	protected Map<Etudiant,Boolean> fichePresence;
	protected Salle S;
	protected String nomProf;
	protected Filière f;
	
	Scanner sc = new Scanner(System.in);
	
	@SuppressWarnings("deprecation")
	public Seance() {
		System.out.println("Entrez le nom de l'élément étudié cette séance");
		this.el.setNomElement(sc.next());
		System.out.println("Entrez la date de la séance format aaaa-mm--jj--hh--mm");
		dateSeance = new Date(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt());
		System.out.println("Entrez le numéro de la salle");
		this.S.nom = sc.next();
		System.out.println("Entrez le nom de la promotion");
		/////////
	}
	
	public Salle getS() {
		return S;
	}
	
	public void setS(Salle s) {
		S = s;
	}
	
	public String getNomProf() {
		return nomProf;
	}
	
	public void setNomProf(String nomProf) {
		this.nomProf = nomProf;
	}
	
	/*public boolean estPresent(Etudiant e) {
		boolean c = true;
		Iterator<Etudiant> it = ListeAbsence.iterator();
		Etudiant etu;
		while (it.hasNext()) {
			etu = it.next();
			if (etu == e) {
				c = false;
				break;
			}else continue;
		}
		return c;
	}*/
	
}