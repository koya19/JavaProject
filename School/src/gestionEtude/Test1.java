package gestionEtude;

public class Test1 {
	public static void main(String[] args) throws ClassNotFoundException {
		/*Promotion p = new Promotion("GI", 2000);
		Etudiant e = new Etudiant("té", "tt", 0, 0, 0, null, null, null, 0, null);
		Element el = new Element("Java", 30, 2);
		p.addStudent(e);
		e.ajouterElement(el);
		Enseignant en = new Enseignant(null, null, 1, 0, 0, null, null, 0);
		en.addElement(el);
		p.addEnseignant(en);
		en.addNotes(p);
		e.afficherNotes();
		e.moyenne();
		
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
		System.out.println("\n--------------------------------\n");
		edt.editEDT("Vendredi", "Après-midi", "Statistiques");
		edt.afficherEmploi();
		System.out.println("\n--------------------------------\n");
		edt.programmeDuJour("Mardi");*/
		
		ChefDeFilière f = new ChefDeFilière("machi adil", "ha", 1, 0, 0, null, null, null, null, null);
		f.gestionChef();
	}

}












/*
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


File f = new File("rababaaaab.txt");
Etudiant et = new Etudiant("BOUAISSI", "Rabab", "RB3E876238", 1 , "rabab@gmail.Com", "0384309560");

try {
	FileOutputStream stylo = new FileOutputStream(f);
	FileInputStream dftar = new FileInputStream(f);
	
	try {
		ObjectOutputStream styloBic = new ObjectOutputStream(stylo);
		styloBic.writeObject(et);
		styloBic.close();
		System.out.println("lalala");
		ObjectInputStream dftarDyalFehd = new ObjectInputStream(dftar);
		Etudiant et1 = (Etudiant)dftarDyalFehd.readObject();
		//et1.setNom("Dftaaaar", "Lfehd");
		System.out.println("ymak adftar lfehd");
		System.out.println(et1.getNom());
	
		dftarDyalFehd.close();
	} catch (IOException r) {

		r.printStackTrace();
	}
	
	
	
} catch (FileNotFoundException e) {
	
	e.printStackTrace();
}*/