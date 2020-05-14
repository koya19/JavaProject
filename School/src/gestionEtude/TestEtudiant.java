package gestionEtude;

//import java.util.Arrays;


public class TestEtudiant {
	public static void main (String[] args) {
		Ecole s = new Ecole ();
		Filière f = new Filière();
		Filière f1 = new Filière();
		Filière f2 = new Filière();
		Promotion p = new Promotion();
		Promotion p1 = new Promotion();
		Etudiant e = new Etudiant("Rhif","Afaf", 1999, 9, 5, "afaf@gmail.com", "0123456789", "A123456", 1, "GI");
		Etudiant e1 = new Etudiant("Lahbil","Mohammed", 1999, 9, 5,"mohammed@gmail.com", "0123456798", "M123456", 1, "GI");
		Etudiant e2 = new Etudiant("Bouihi","Nouamane", 1999, 9, 5,"nouamane@gmail.com", "0123453256", "N123456", 1, "GI");
		Etudiant e3 = new Etudiant("Slalmi","Ibtissam", 1999, 9, 5,"ibtissam@gmail.com", "0122954758", "I123456", 1, "GI");
		//e1.addNotes(16,5);
		//System.out.println(Arrays.toString(notes));
		/*System.out.println(e1);
		e1.addNotes(12,0);
		e1.addNotes(13,5);
		e1.addNotes(5,11);
		e1.addNotes(18,9);
		e.addNotes(14,10);
		e.addNotes(19,5);
		e.addNotes(5,11);
		e.addNotes(8,2);

		//System.out.println(Arrays.toString(notes));
		//System.out.println("la note max est "+e1.maxNote());
		//System.out.println("la note min est "+e1.minNote());
		System.out.println(e1.moyenne());
		e1.afficherEtudiant();
		System.out.println(e.moyenne());
		e.afficherEtudiant();*/
		s.addFilière(f2);
		s.addFilière(f1);
		s.addFilière(f);
		s.afficherEcole();
		p.addStudent(e);
		p.addStudent(e);
		p.addStudent(e2);
		p.addStudent(e1);
		p.addStudent(e3);
		//System.out.println(p.moyennePromo());
		//p.afficherPromo();
		p1.addStudent(e);
		p1.addStudent(e1);
		p1.addStudent(e2);
		p1.addStudent(e3);
		//f.addPromo(p);
		//f.addPromo(p1);
		f.afficherFiliere();
		
		Discipline D1 = new Discipline();
		D1.addCompétence();
		D1.addCompétence();
		D1.addCompétence();
		D1.afficherDiscipline();
	
		Enseignant en = new Enseignant ("ELMARZOUQI", "Nabil", 1970, 5, 8, "nabil@gmail.com", "0123453499", 2);
		Element el1 = new Element("Java", 30, 2);
		Element el2 = new Element("Java avancé", 40, 2);
		en.addElement(el1);
		en.addElement(el2);
		en.afficherEnseignant();
		p.addEnseignant(en);
		p.addEnseignant(en);
		p.afficherListeEnseignant();
		
		Element el = new Element("Java", 25, 2);
		Element el11 = new Element("Java avancé", 35, 2);
		Module m = new Module("Java", 60 ,2);
		m.addElement(el11);
		m.addElement(el);
		m.addNote(el11, 4.5);
		m.addNote(el, 18.5);
		m.etatModule();
		System.out.println(m.moyenne());
		m.editNote(el11, 8);
		m.etatModule();
		System.out.println(m.moyenne());
		System.out.println(m.getNote(el11));
		System.out.println(m.getNote(el));
		m.afficherModule();
		
		EmploiDuTemps edt = new EmploiDuTemps(8);
		edt.addSeance("Lundi", "Matin", "TCP/IP");
		edt.addSeance("Lundi", "Après-midi", "Unix");
		edt.addSeance("Mardi", "Matin", "SQL");
		edt.addSeance("Mardi", "Après-midi", "Java avancé");
		edt.addSeance("Mercredi", "Matin", "Traitement de signal");
		edt.addSeance("Jeudi", "Matin", "R.O");
		edt.addSeance("Jeudi", "Après-midi", "Administration Système");
		edt.addSeance("Vendredi", "Matin", "Java");
		edt.addSeance("Vendredi", "Après-midi", "Java");
		edt.afficherEmploi();
		edt.editEDT("Vendredi", "Après-midi", "Statistiques");
		edt.afficherEmploi();
		edt.programmeDuJour("Mardi");
	}
	
}