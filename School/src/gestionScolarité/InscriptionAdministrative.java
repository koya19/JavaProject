package gestionScolarit�;

import java.util.Date;

import java.util.Scanner;
import java.util.InputMismatchException;

import gestionEtude.*;

public class InscriptionAdministrative {
	protected String nom;
	protected String prenom;
	protected String CNE;
	protected Date dN = new Date();
	protected String mail;
	protected String telephone;
	protected String formation;
	protected boolean paiement = false;
	protected String sexe;
	protected String fili�re;
	protected Etudiant e = new Etudiant(null, null, 1, 1, 1, null, null, null, 1, null);
	
	
	Scanner sc = new Scanner(System.in);
	
	public InscriptionAdministrative() {
		setNom();
		setPrenom();
		setdN();
		setCNE();
		setFili�re();
		setMail();
		setTelephone();
		setFormation();
		setSexe();
		setPaiement();
		confirmer();
	}

	public String getCNE() {
		return CNE;
	}

	public void setCNE() {
		System.out.println("Veuillez entrer votre CNE");
		this.CNE = sc.next();
	}

	public String getNom() {
		return nom + " " + prenom;
	}

	public void setNom() {
		System.out.println("Veuillez entrer votre nom");
		this.nom = sc.next();
	
	}
	
	public void setPrenom() {
	
		System.out.println("Veuillez entrer votre pr�nom");
		this.prenom = sc.next();
		
	}
	
	@SuppressWarnings("deprecation")
	public String getdN() {
		String s = "";
		s = dN.getDate() + "-" + dN.getMonth() + "-" + dN.getYear();
		return s;
	}

	@SuppressWarnings("deprecation") 
	public void setdN() {
		System.out.println("Veuillez entrer votre annee de naissance");
		dN.setYear(sc.nextInt());
		sc.nextLine();
		System.out.println("Veuillez entrer votre mois de naissance");
		dN.setMonth(sc.nextInt());
		sc.nextLine();
		System.out.println("Veuillez entrer votre jour de naissance");
		dN.setDate(sc.nextInt());
		sc.nextLine();
	}

	public String getMail() {
		return mail;
	}

	public void setMail() {
		
		System.out.println("Veuillez entrer votre mail");
		this.mail = sc.next();
		
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone() {
		
		System.out.println("Veuillez entrer votre telephone");
		this.telephone = sc.next();
		
	}

	public String getFormation() {
		return formation;
	}

	public void setFormation() {
		
		try {
			System.out.println("Votre formation est :\n 1) CPGE\n 2) Autre");
			int i = sc.nextInt();
			sc.nextLine();
			if (i == 1) {
				System.out.println("Veuillez pr�ciser votre fili�re");
				String s = sc.next();
				this.formation = "CPGE fili�re : " + s;
			}
			else if (i == 2){
				System.out.println("Veuillez pr�ciser votre formation");
				String s = sc.next();
				this.formation = s;
			}
			else {
				System.out.println("Ressayer");
				setFormation();
			}
		} catch (InputMismatchException e) {
			e.printStackTrace();
			System.out.println("Ressayer");
		}
		
	}

	public String isPaiement() {
		if (paiement == true) return "Paiement valid�";
		else return "Paiement non valid�";
	}

	public void setPaiement() {
	
		System.out.println("Est-ce que vous avez effectu� le paiement :\n 1) Oui\n 2) Non");
		int z = sc.nextInt();
		
		if (z == 1) {
			this.paiement = true;
		}
		else if (z == 2) {
			this.paiement = false;
		} 
		else {
			System.out.println("Ressayer");
			setPaiement();
		}
		
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe() {
		int I;
		System.out.println("Vous �tes : \n 1) Femme\n 2) Homme");
		I = sc.nextInt();
		if (I == 1) sexe = "Femme";
		else if (I == 2) sexe = "Homme";
		else {
			System.out.println("Ressayez\n");
			setSexe();
		}
	}

	@Override
	public String toString() {
		return "Nom complet : " + nom + " " + prenom + "\nSexe : " + sexe + "\nDate de naissance : " + getdN()
				+ "\nT�l�phone : " +telephone + "\nAdresse �lectronique : " + mail + "\nFormation initiale : " + formation + "\nEtat de  paiement : " + isPaiement() ;
	}
	
	public void r�capitulatifInscription() {
		System.out.println(toString());
	}
	
	@SuppressWarnings("deprecation")
	public void confirmer() {
		System.out.println("V�rifiez les informations que vous avez saisies : \n");
		r�capitulatifInscription();
		System.out.println("\nVous �tes sur de ces informations ?\n 1) Confirmer\n 2) Il y a une erreur quelque part");
		int i = sc.nextInt();
		sc.nextLine();
		if (i == 1) {
			System.out.println("Insciption enregist�e avec succ�s\nBienvenu ");
			e = new Etudiant (nom, prenom, dN.getYear(), dN.getMonth(), dN.getDate(),mail, telephone, CNE, 1, fili�re);
			e.afficherEtudiant();
			quitter();
		}
		else if (i == 2) {
			sc.nextLine();
			System.out.println("Vous voulez modifier : \n 1) Votre nom\n 2) Votre prenom\n 3) Votre date de naissance\n 4) Votre sexe\n 5) Votre CNE\n 6) Votre num�ro de t�l�phone\n 7) Votre adresse �lectronique\n 8) Votre formation\n 9) L'�tat du paiement");
			int j = sc.nextInt();
			switch (j) {
			case 1 : setNom(); confirmer(); break;
			case 2 : setPrenom(); confirmer(); break;
			case 3 : setdN(); confirmer(); break;
			case 4 : setSexe(); confirmer(); break;
			case 5 : setCNE(); confirmer(); break;
			case 6 : setTelephone(); confirmer(); break;
			case 7 : setMail(); confirmer(); break;
			case 8 : setFormation(); confirmer(); break;
			case 9 : setPaiement(); confirmer(); break;
			}
		}
		else {
			System.out.println("Ressayer");
			confirmer();
		}
	}
	
	public void statInscription() {
		
	}
	
	public void quitter() {
		sc.close();
	}

	public String getFili�re() {
		return fili�re;
	}

	public void setFili�re() {
		System.out.println("Entrez votre fili�re :");
		this.fili�re = sc.next();
	}
	
}