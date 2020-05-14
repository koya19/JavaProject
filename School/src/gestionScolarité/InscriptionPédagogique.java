package gestionScolarit�;

import java.util.Scanner;
import gestionEtude.*;

public class InscriptionP�dagogique {
	protected int anneePromo;
	protected Promotion p;
	protected Fili�re f;
	protected Etudiant et;
	protected Ecole ec;
	
	Scanner sc = new Scanner(System.in);
	
	public InscriptionP�dagogique(Ecole ec, Fili�re f) {
		int i = 1;
		int j = 1;
		this.ec = ec;
		System.out.println("Choisissez votre fili�re : ");
		for(Fili�re ff : ec.liste) {
			System.out.println(i + ") " + ff.getName());
			i++;
		}
		i = sc.nextInt();
		for(Fili�re ff : ec.liste) {
			if (j == i) {
				this.f = ff;
			}
			else j++;
		}
		System.out.println("Vous vous inscrivez au titre de la :\n 1) Premi�re ann�e\n 2) Deuxi�me ann�e\n 3) Troisi�me ann�e");
		this.anneePromo = sc.nextInt();
		gestion();
	}
	
	public void firstYear() {
		if (anneePromo == 1) {
			InscriptionAdministrative ia = new InscriptionAdministrative();
			for (Promotion pp : f.Table) {
				if (pp.getAnneePromo() == 1) {
					pp.addStudent(ia.e);
				}
			}
		}
	}
	
	public void secondYear() {
		int i = 1;
		int j = 1;
		boolean a= false;
		
				for (Promotion pp : f.Table) {
					if (pp.getAnneePromo() == 1) {
						System.out.println("Choisissez votre nom :");
						pp.listEtudiant();
						i = sc.nextInt();
						break;
					}
				}
			
					for (Promotion pp : f.Table) {
						if (pp.getAnneePromo() == 1) { 
							p = pp;
							for (Etudiant e : p.Promo) {
								if (j == i) {
									if (e.getDecision().equalsIgnoreCase("Passage")) {
											e.setAnneePromo(2);
											et = e;
											p.deleteStudent(e);
											System.out.println("F�licitations, vos notes et discipline vous ont permis de r�ussir. \nBienvenu dans cette nouvelle ann�e !");
											System.out.println("\n----------------------\n");
											a = true;
											pp.afficherPromo();
											System.out.println("\n----------------------\n");
											for (Promotion pt : f.Table) {
												if (pt.getAnneePromo() == 2 && a == true) {
													p = pt;
													p.addStudent(et);
													p.afficherPromo();
												}
											}
									}
									else {
											System.out.println("D�sol�, vous allez redoubler. Bon courage !");
									}
								}
								else j++;
							}			
						}
					}	
				
			
	}
	
	public void thirdYear() {
		int i = 1;
		int j = 1;
		boolean a= false;
				for (Promotion pp : f.Table) {
					if (pp.getAnneePromo() == 2) {
						System.out.println("Choisissez votre nom :");
						pp.listEtudiant();
						i = sc.nextInt();
						break;
					}
				}
			
					for (Promotion pp : f.Table) {
						if (pp.getAnneePromo() == 2) {
							for (Etudiant e : pp.Promo) {
								if (j == i) {
									if (e.getDecision().equalsIgnoreCase("Passage")) {
											e.setAnneePromo(3);
											et = e;
											pp.deleteStudent(et);
											System.out.println("F�licitations, vos notes et discipline vous ont permis de r�ussir. \nBienvenu dans cette nouvelle ann�e !\n");
											a = true;
											System.out.println("\n----------------------\n");
											pp.afficherPromo();
											System.out.println("\n----------------------\n");
											for (Promotion pt : f.Table) {
												if (pt.getAnneePromo() == 3 && a == true) {
													pt.addStudent(et);
													pt.afficherPromo();
												}
											}
									}
									else {
											System.out.println("D�sol�, vous allez redoubler. Bon courage !\n");
									}
								}
								else j++;
							}			
						}
					}	
				
	}
	
	public void gestion() {
		switch (anneePromo) {
		case 1 : firstYear(); break;
		case 2 : secondYear(); break;
		case 3 : thirdYear(); break;
		default : System.out.println("R�essayer"); anneePromo = sc.nextInt(); gestion(); break;
		}
	}
}
