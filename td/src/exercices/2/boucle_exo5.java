package td1;
import java.util.Scanner;

/*Calculer le pgcd de 2 nombres (on soustrait le plus petit nombre du plus grand jusqu�� obtenir
l��galit�). Faire tourner � la main cet algorithme pour 65 et 10, en d�duire une version am�lior�e
utilisant le reste de la division enti�re.
*/

public class boucle_exo5 {
	static Scanner sc = new Scanner(System.in);
	public static void main (String arg[]) {
		pgcd(10, 65);		
	}


	static void pgcd(int a, int b) {

		int res;
		while ((res= a%b)>0 ) {
			a=b;
			b=res;
		}
	
		System.out.println("pgcd = " + b);
	
}

}