package gestionScolarité;

import gestionEtude.*;

public class Testeeu {

	public static void main(String[] args) {
		//InscriptionAdministrative i = new InscriptionAdministrative(); 
		//i.récapitulatifInscription();
		System.out.println("\n----------------------\n");
		//i.confirmer();
		Ecole ec = new Ecole("AIAC", "Casa", "Ingenierie", 2000);
		Filière f = new Filière("GI", 3);
		Filière f1 = new Filière("GIP", 3);
		ec.addFilière(f);
		ec.addFilière(f1);
		Promotion p = new Promotion("GI14",3);
		Promotion p1 = new Promotion("GI15",2);
		Promotion p2 = new Promotion("GI16",1);
		Promotion p3 = new Promotion("GIP14",3);
		Promotion p4 = new Promotion("GIP15",2);
		Promotion p5 = new Promotion("GIP16",1);
		f.addPromo(p);
		f.addPromo(p1);
		f.addPromo(p2);
		f1.addPromo(p3);
		f1.addPromo(p4);
		f1.addPromo(p5);
		Etudiant e = new Etudiant("Rhif","Afaf", 1999, 9, 5, "afaf@gmail.com", "0123456789", "A123456", 1, "GI");
		Etudiant e1 = new Etudiant("Lahbil","Mohammed", 1999, 9, 5,"mohammed@gmail.com", "0123456798", "M123456", 1, "GI");
		Etudiant e2 = new Etudiant("Bouihi","Nouamane", 1999, 9, 5,"nouamane@gmail.com", "0123453256", "N123456", 1, "GI");
		Etudiant e3 = new Etudiant("Slalmi","Ibtissam", 1999, 9, 5,"ibtissam@gmail.com", "0122954758", "I123456", 1, "GI");
		e.setDecision("Redoublement");
		e1.setDecision("Redoublement");
		e2.setDecision("Passage");
		e3.setDecision("Passage");
		p.addStudent(e1);
		p.addStudent(e);
		p1.addStudent(e3);
		p2.addStudent(e2);
		p3.addStudent(e1);
		p3.addStudent(e);
		p4.addStudent(e3);
		p5.addStudent(e2);
		
		InscriptionPédagogique ip = new InscriptionPédagogique(ec,f);
		//System.out.println("\n----------------------\n");
//		p.afficherPromo();
//		System.out.println("\n----------------------\n");
//		p1.afficherPromo();
	//	System.out.println("\n----------------------\n");
//		p2.afficherPromo();
//		p2.deleteStudent(e2);
//		p2.afficherPromo();
	
	}

}
