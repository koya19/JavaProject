package gestionEtude;

public class EmploiDuTemps {
	protected int nbrSeance;
	protected String emploi = "";
	protected String l = "";
	protected String ma = "";
	protected String me = "";
	protected String j = "";
	protected String v = "";
	protected String s = "";
	protected String l1 = "";
	protected String ma1 = "";
	protected String me1 = "";
	protected String j1 = "";
	protected String v1 = "";
	protected String s1 = "";
	
	public EmploiDuTemps(int nbrSeance) {
		this.nbrSeance = nbrSeance;
		this.emploi = "";
	}
	
	protected static int i = 0;
	
	public void addSeance(String jour, String periode, String mati�re) {
		switch (jour) {
		case "Lundi" : switch(periode) {
		                                case "Matin" : l = jour+" de 9h00 � 12h45 : "+ mati�re +"\n";break;
		                                case "Apr�s-midi" : l1 = jour + " de 14h15 � 18h00 : "+ mati�re +"\n";break;
		                               };break;
		case "Mardi" : switch(periode) {
                                        case "Matin" : ma = jour+" de 9h00 � 12h45 : "+ mati�re +"\n";break;
                                        case "Apr�s-midi" : ma1 = jour + " de 14h15 � 18h00 : "+ mati�re +"\n";break;
		                               };break;
		case "Mercredi" : switch(periode) {
                                        case "Matin" : me = jour+" de 9h00 � 12h45 : "+ mati�re +"\n";break;
                                        case "Apr�s-midi" : me1 = jour + " de 14h15 � 18h00 : "+ mati�re +"\n";break;
                                       };break;
		case "Jeudi" : switch(periode) {
                                        case "Matin" : j = jour+" de 9h00 � 12h45 : "+ mati�re +"\n";break;
                                        case "Apr�s-midi" : j1 = jour + " de 14h15 � 18h00 : "+ mati�re +"\n";break;
                                       };break;
		case "Vendredi" : switch(periode) {
                                        case "Matin" : v = jour+" de 9h00 � 12h45 : "+ mati�re +"\n";break;
                                        case "Apr�s-midi" : v1 = jour + " de 14h15 � 18h00 : "+ mati�re +"\n";break;
                                       };break;
		case "Samedi" : switch(periode) {
                                        case "Matin" : s = jour+" de 9h00 � 12h45 : "+ mati�re +"\n";break;
                                        case "Apr�s-midi" : s1 = jour + " de 14h15 � 18h00 : "+ mati�re +"\n";break;
                                        };break;			}
		 emploi = l + l1 +"\n"+ ma+ ma1 +"\n"+ me+ me1 +"\n"+ j + j1 +"\n"+ v + v1 +"\n"+ s + s1;
	}
	public void editEDT(String jour, String p�riode , String mati�re) {
		addSeance(jour, p�riode, mati�re);
	}
	
	public void programmeDuJour(String jour) {
		switch (jour) {
		case "Lundi" : System.out.println(l+l1);break;
		case "Mardi" : System.out.println(ma+ma1);break;
		case "Mercredi" : System.out.println(me+me1);break;
		case "Jeudi" : System.out.println(j+j1);break;
		case "Vendredi" : System.out.println(v+v1);break;
		case "Samedi" : System.out.println(s+s1);break;
		}
	}
	
	public String toString() {
		return emploi;
	}
	
	public void afficherEmploi() {
		System.out.println(toString());
	}
	
}