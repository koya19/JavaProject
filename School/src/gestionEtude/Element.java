package gestionEtude;

import java.util.Scanner;

public class Element {
	protected String nomElement;
	protected int volumeHoraire;
	protected int volumeHoraireCours;
	protected int volumeHoraireTD;
	protected int volumeHoraireTP;
	protected int volumeHoraireAP;
	protected int coefficient;
	protected float note; 
	
	Scanner sc = new Scanner(System.in);
	
	public Element() {
		System.out.println("Entrez le nom de l'élément");
		this.nomElement = sc.next();
		System.out.println("Entrez le volume horaire de l'élément");
		this.volumeHoraire = sc.nextInt();
		System.out.println("Entrez le pourcentage dédié au cours magistral (x%)");
		this.volumeHoraireCours = (sc.nextInt()*volumeHoraire)/100;
		System.out.println("Entrez le pourcentage dédié au TD (x%)");
		this.volumeHoraireTD = (sc.nextInt()*volumeHoraire)/100;
		System.out.println("Entrez le pourcentage dédié au TP (x%)");
		this.volumeHoraireTP = (sc.nextInt()*volumeHoraire)/100;
		this.volumeHoraireAP = volumeHoraire - volumeHoraireCours - volumeHoraireTD - volumeHoraireTP;
		System.out.println("Entrez le coefficient de l'élément");
		this.coefficient = sc.nextInt();
	}
	
	public Element(String nomElement, int volumeHoraire, int coefficient) {
		super();
		this.nomElement = nomElement;
		this.volumeHoraire = volumeHoraire;
		this.coefficient = coefficient;
		this.volumeHoraireAP = volumeHoraire/15;
		this.volumeHoraireTP = volumeHoraire/5;
		this.volumeHoraireTD = volumeHoraire/7;
		this.volumeHoraireCours = volumeHoraire - (volumeHoraireAP + volumeHoraireTD + volumeHoraireTP);
	}

	public Element(String nomElement, int volumeHoraire, int volumeHoraireCours, int volumeHoraireTD, int volumeHoraireTP,
			int volumeHoraireAP, int coefficient) {
		super();
		this.nomElement = nomElement;
		this.volumeHoraire = volumeHoraire;
		this.volumeHoraireCours = volumeHoraireCours;
		this.volumeHoraireTD = volumeHoraireTD;
		this.volumeHoraireTP = volumeHoraireTP;
		this.volumeHoraireAP = volumeHoraireAP;
		this.coefficient = coefficient;
	}

	public float getNote() {
		return note;
	}

	public void setNote(float note) {
		this.note = note;
	}

	public int getVolumeHoraire() {
		return volumeHoraire;
	}

	public void setVolumeHoraire(int volumeHoraire) {
		this.volumeHoraire = volumeHoraire;
	}
	
	public void setVolumeHoraire() {
		System.out.println("Entrez le volume horaire de l'élément");
		this.volumeHoraire = sc.nextInt();
	}

	public int getCoefficient() {
		return coefficient;
	}

	public void setCoefficient(int coefficient) {
		this.coefficient = coefficient;
	}
	
	public void setCoefficient() {
		System.out.println("Entrez le coefficient de l'élément");
		this.coefficient = sc.nextInt();
	}
	
	public String getNomElement() {
		return nomElement;
	}

	public void setNomElement(String nomElement) {
		this.nomElement = nomElement;
	}
	
	public void setNomElement() {
		System.out.println("Entrez le nom de l'élément");
		this.nomElement = sc.next();
	}

	public int getVolumeHoraireCours() {
		return volumeHoraireCours;
	}

	public void setVolumeHoraireCours(int volumeHoraireCours) {
		this.volumeHoraireCours = volumeHoraireCours;
	}

	public int getVolumeHoraireTD() {
		return volumeHoraireTD;
	}

	public void setVolumeHoraireTD(int volumeHoraireTD) {
		this.volumeHoraireTD = volumeHoraireTD;
	}

	public int getVolumeHoraireTP() {
		return volumeHoraireTP;
	}

	public void setVolumeHoraireTP(int volumeHoraireTP) {
		this.volumeHoraireTP = volumeHoraireTP;
	}
	
	public void setRepartitionVolumeHoraire() {
		System.out.println("Entrez le pourcentage dédié au cours magistral (x%)");
		this.volumeHoraireCours = (sc.nextInt()*volumeHoraire)/100;
		System.out.println("Entrez le pourcentage dédié au TD (x%)");
		this.volumeHoraireTD = (sc.nextInt()*volumeHoraire)/100;
		System.out.println("Entrez le pourcentage dédié au TP (x%)");
		this.volumeHoraireTP = (sc.nextInt()*volumeHoraire)/100;
		this.volumeHoraireAP = volumeHoraire - volumeHoraireCours - volumeHoraireTD - volumeHoraireTP;
		System.out.println("Entrez le coefficient de l'élément");
		this.coefficient = sc.nextInt();
	}
	
	public int getVolumeHoraireAP() {
		return volumeHoraireAP;
	}

	public void setVolumeHoraireAP(int volumeHoraireAP) {
		this.volumeHoraireAP = volumeHoraireAP;
	}

	public String toString() {
		return "L'élement "+ nomElement + " de volume horaire : " + volumeHoraire + "H réparti ainsi : "+volumeHoraireCours+"H de cours"+volumeHoraireTD+"H de TP"+volumeHoraireTD+"H de TD"+volumeHoraireAP+"H d'activités pratiques";
	}
	
	public void afficherElement() {
		System.out.println(toString());
	}
}