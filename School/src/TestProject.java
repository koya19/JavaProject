import gestionEtude.*;
import java.util.Scanner;
import School.*;

public class TestProject {

	public static void main(String[] args) {
		String mdpd = "directeur";
		String mdpr = "responsable";
		String mdpc = "chef de filière";
		String mdpe = "étudiant";
		System.out.println("Entrez le nom de votre école");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println("******************************** Bienvenu à " + s +" ********************************");
		outer:{
		System.out.println("\n\nVous êtes un :\n 1) Directeur\n 2) Responsable\n 3) Chef de filière\n 4) Etudiant\n 5) Visiteur");
		int i = sc.nextInt();
		if (i == 1) {
			System.out.println("\nTapez le mot de passe du mode directeur");
		 	String test = sc.next();
			if (test.equals(mdpd)) {
				System.out.println("\nVous êtes maintenant en mode directeur\n\nChoisissez votre prochaine action :\n 1) Ajouter des informations sur l'école \n 2) Créer une équipe pédagogique 3) Modifier un membre de l'équipe\n 4) ");
			}
			else {
				System.out.println("\nMot de passe incorect ! \n\n Voulez-vous :\n 1) Ressayer\n 2) Revenir à l'écran d'accueil ");
				int j = sc.nextInt();
				if (j == 1) i = 1;
				else if (j == 2) {
					
				}
				}
			}
		}
	}

}
