package gestionEtude;


import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ChefDeFilière extends Responsable {
	protected String nomFilière;
	protected Set<Promotion> liste;	

	public ChefDeFilière() {
		super();
		System.out.println("Entrez le nom de la filière dont vous êtes responsable");
		this.nomFilière = sc.next();
		
		liste = new TreeSet<>();
	}

	public ChefDeFilière(String nom, String prenom, int year, int month, int day, String mail, String telephone,String nomFilière,String tâche, String numBureau) {
		super(nom, prenom, year, month, day, mail, telephone, tâche, numBureau);
		this.nomFilière = nomFilière;
		this.liste = new TreeSet<>();
	}

	public void gestionChef() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Choisissez votre prochaine action : \n 1) Ajouter une promotion\n 2) Supprimer une promotion\n 3) Ajouter un étudiant à une promotion\n 4) Supprimer un étudiant d'une promotion\n 5) Ajouter un enseignant\n 6) Supprimer un enseignant\n 7) Affecter une promotion à un enseignant\n 8) Afficher les promotions de la filière\n 9) Quitter");
		
		if (sc.hasNextInt()) {
			int j = sc.nextInt();
			if(j > 0 && j < 10){
			switch (j) {
			case 1 : addPromo(); gestionChef(); break;
			case 2 : removePromo(); gestionChef(); break;
			case 3 : addStudent(); gestionChef(); break;
			case 4 : removeStudent(); gestionChef(); break;
			case 5 : addEnseignant(); gestionChef(); break;
			case 6 : deleteEnseignant(); gestionChef(); break;
			case 7 : affecterPromoEnseignant(); gestionChef(); break;
			case 8 : afficherPromo(); gestionChef(); break;
			case 9 : sc.close(); break;
			}
		}
			else {
				System.out.println("Veuillez réessayer");
				gestionChef();
			}
			
		} else {
			System.out.println("Veuillez réessayer");
			gestionChef();
		}
		
	}
	
	public void addPromo() {
		Promotion p = new Promotion();
		liste.add(p);
	}
	
	public void addPromo(Promotion p) {
		liste.add(p);
	}

	public void removePromo() {
		int i = 1;
		System.out.println("Choisissez une promotion : ");
		for (Promotion pr : liste) {
			System.out.println(i + ") " + pr.getNomPromo());
			i++;
		}
		
		int j = sc.nextInt();
		i = 1;
		for (Promotion pr : liste) {
			if (i == j) liste.remove(pr);
			else i++;
		}
	}
	
	public void removePromo(Promotion p) {
		liste.remove(p);
	}
	
	public void addStudent() {
		Promotion p = null;
		int i = 1;
		System.out.println("Choisissez une promotion :");
		for (Promotion pr : liste) {
			System.out.println(i+ ") " +pr.getNomPromo());
			i++;
		}
		int j = sc.nextInt();
		int s = 1;
		for (Promotion pr : liste) {
			if (s == j) {
				p = pr; 
				break;
			}
			else s++;
		}
		
		Etudiant e = new Etudiant();
		for (Promotion pr : liste) {
			if (p.getNomPromo() == pr.getNomPromo()) {
				pr.addStudent(e);
				break;
			}
		}
	}
	
	public void removeStudent() {
		int i = 1;
		System.out.println("Choisissez une promotion :");
		for (Promotion pr : liste) {
			System.out.println(i + ") " + pr.getNomPromo());
			i++;
		}
		
		int j = sc.nextInt();
		int c;
		i = 1;
		int s = 1;
		int x = 1;
		for (Promotion pr : liste) {
			if (s == j) {
				i = 1;
				System.out.println("Choisissez un étudiant");
				for (Etudiant et : pr.Promo) {
					System.out.println(i + ") " + et.getNom());
					i++;
				}
				
				c = sc.nextInt();
				
				for (Etudiant et : pr.Promo) {
					if (x == c) {
						pr.deleteStudent(et);
						break;
					}
					else x++;
				}
				break;
			}
			else s++;
		}
	}

	public void deleteStudent(Etudiant e, Promotion p) {
		for (Promotion pr : liste) {
			if (p.getNomPromo() == pr.getNomPromo()) {
				pr.deleteStudent(e);
				break;
			}
		}
	}
	
	public void addEnseignant(Enseignant en, Promotion p) {
		for (Promotion pr : liste) {
			if (p.getNomPromo() == pr.getNomPromo()) {
				pr.addEnseignant(en);
				break;
			}
		}
	}
	
	public void addEnseignant() {
		Promotion p = null;
		int i = 1;
		System.out.println("Choisissez une promotion :");
		for (Promotion pr : liste) {
			System.out.println(i+ ") " +pr.getNomPromo());
			i++;
		}
		int j = sc.nextInt();
		int s = 1;
		for (Promotion pr : liste) {
			if (s == j) {
				p = pr; 
				break;
			}
			else s++;
		}
		
		Enseignant e = new Enseignant();
		for (Promotion pr : liste) {
			if (p.getNomPromo() == pr.getNomPromo()) {
				pr.addEnseignant(e);
				break;
			}
		}
	}
	
	public void deleteEnseignant() {
		int i = 1;
		
		System.out.println("Choisissez une promotion :");
		for (Promotion pr : liste) {
			System.out.println(i + ") " + pr.getNomPromo());
			i++;
		}
		
		int j = sc.nextInt();
		int s = 1;
		
		for (Promotion pr : liste) {
			if (s == j) {
				i = 1;
				s = 1;
				System.out.println("Choisissez un enseignant");
				for (Enseignant et : pr.list) {
					System.out.println(i + ") " + et.getNom());
					i++;
				}
				
				j = sc.nextInt();
				
				for (Enseignant en : pr.list) {
					if (s == j) {
						pr.deleteEnseignant(en);
						break;
					}
					else s++;
				}
				break;
			}
			else s++;
		}
	}
	
	public void deleteEnseignant(Enseignant en, Promotion p) {
		for (Promotion pr : liste) {
			if (p.getNomPromo() == pr.getNomPromo()) {
				pr.deleteEnseignant(en);
				break;
			}
		}
	}
	
	public void affecterPromoEnseignant(Enseignant e, Promotion p) {
		for (Promotion pr : liste) {
			for(Enseignant en : pr.list) {
				if (en.equals(e)) e.promo = p;
			}
		}
	}
	
	public void affecterPromoEnseignant() {
		Promotion p = null;
		Enseignant en = null;
		int i = 1;
		System.out.println("Choisissez une promotion :");
		for (Promotion pr : liste) {
			System.out.println(i + ") " + pr.getNomPromo());
			i++;
		}
		
		int j = sc.nextInt();
		int s = 1;
		
		for (Promotion pr : liste) {
			if (s == j) {
				p = pr; 
				break;
			}
			else s++;
		}
		
		System.out.println("Choisissez un enseignant");
		for (Enseignant et : p.list) {
			System.out.println(i + ") " + et.getNom());
			i++;
		}
		
		j = sc.nextInt();
		
		for (Enseignant et : p.list) {
			if (s == j) {
				en = et;
				break;
			}
			else s++;
		}
		affecterPromoEnseignant(en, p);
	}
	
	public void afficherPromo() {
		String s = "";
		System.out.println("La filière "+nomFilière+" contient :");
		for (Promotion p : liste) {
			s += "            "+p.getNomPromo()+"\n";
		}
		System.out.println(s);
	} 
}
